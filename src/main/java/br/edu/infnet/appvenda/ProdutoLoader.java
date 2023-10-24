package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvenda.model.domain.Alimenticio;
import br.edu.infnet.appvenda.model.domain.Eletronico;
import br.edu.infnet.appvenda.model.domain.Produto;
import br.edu.infnet.appvenda.model.service.ProdutoService;

@Order(2)
@Component
public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private ProdutoService produtoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/produtos.txt");		
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();

		String[] campos = null;

		while(linha != null) {
			
			campos = linha.split(";");
			
			switch (campos[6]) {
			case "A":
				Alimenticio alimenticio = new Alimenticio();
				alimenticio.setCodigo(Integer.valueOf(campos[0]));
				alimenticio.setDescricao(campos[1]);
				alimenticio.setEstoque(Boolean.valueOf(campos[2]));
				alimenticio.setPreco(Float.valueOf(campos[3]));
				alimenticio.setCaracteristica(campos[4]);
				alimenticio.setOrganico(Boolean.valueOf(campos[5]));
				
				produtoService.incluir(alimenticio);
				
				break;

			case "E":
				Eletronico eletronico = new Eletronico();
				eletronico.setCodigo(Integer.valueOf(campos[0]));
				eletronico.setDescricao(campos[1]);
				eletronico.setEstoque(Boolean.valueOf(campos[2]));
				eletronico.setPreco(Float.valueOf(campos[3]));
				eletronico.setGarantiaMeses(Integer.valueOf(campos[4]));
				eletronico.setMarca(campos[5]);
				
				produtoService.incluir(eletronico);
				
				break;

			default:
				break;
			}
									
			linha = leitura.readLine();
		}

		for(Produto produto: produtoService.obterLista()) {
			System.out.println("[Produto] " + produto);			
		}
		
		leitura.close();
	}
}