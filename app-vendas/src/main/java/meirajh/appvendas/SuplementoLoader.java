package meirajh.appvendas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import meirajh.appvendas.domain.Suplemento;
import meirajh.appvendas.service.SuplementoService;


@Order(3)
@Component
public class SuplementoLoader implements ApplicationRunner {
	
	@Autowired
	private SuplementoService suplementoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/suplemento.txt");		
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();

		String[] campos = null;
				
		while(linha != null) {
			
			campos = linha.split(";");
			
			Suplemento suplemento = new Suplemento();

			suplemento.setId(Integer.valueOf(campos[0]));
			suplemento.setCodigo(Integer.valueOf(campos[2]));
			suplemento.setDescricao(campos[1]);
			suplemento.setEstoque(Boolean.valueOf(campos[3]));
			suplemento.setPreco(Float.valueOf(campos[4]));
			suplemento.setCaracteristica(campos[6]);
			suplemento.setPeso(Float.valueOf(campos[5]));
			
			suplementoService.incluir(suplemento);
			
			linha = leitura.readLine();
		}

		for(Suplemento suplemento: suplementoService.obterLista()) {
			System.out.println("[Suplemento] " + suplemento);			
		}
		
		leitura.close();
	}
}
