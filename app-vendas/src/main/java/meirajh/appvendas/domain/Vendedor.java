package meirajh.appvendas.domain;


public class Vendedor extends Usuario {
	
	private String cnpj;
	
	public String toString() {
		return String.format("%s - %s - %s", nome, cnpj, email);
	}
	
	public String getCNPJ() {
		return cnpj;
	}
	
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
