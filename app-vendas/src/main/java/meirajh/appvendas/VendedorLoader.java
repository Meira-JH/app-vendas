package meirajh.appvendas;


import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import meirajh.appvendas.domain.Vendedor;

@Order(1)
@Component

public class VendedorLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/vendedor.txt");		
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();

		String[] campos = null;

		while(linha != null) {
			
			campos = linha.split(";");
			
			Vendedor vendedor = new Vendedor();
			
			vendedor.setNome(campos[0]);
			vendedor.setCNPJ(campos[1]);
			vendedor.setEmail(campos[2]);
												
			linha = leitura.readLine();
		}

		System.out.println("[Vendedor] ");			

		leitura.close();
	}
}
