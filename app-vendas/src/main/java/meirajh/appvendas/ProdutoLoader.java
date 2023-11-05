package meirajh.appvendas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import meirajh.appvendas.domain.Produto;
import meirajh.appvendas.service.ProdutoService;

@Order(2)
@Component

public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private ProdutoService produtoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/produto.txt");		
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();

		String[] campos = null;

		while(linha != null) {
			
			campos = linha.split(";");
			
			switch (campos[6]) {

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
