package meirajh.appvendas.domain;

public class Suplemento extends Produto {
	
	private String caracteristica;
	private float peso;
	
	@Override
	public String toString() {
		return String.format (
				"%s - %d - %.2f - %s - %s - %.2f", 
				super.getDescricao(), 
				super.getCodigo(), 
				super.getPreco(), 
				super.isEstoque(), 
				caracteristica, 
				peso
			);
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String getCaracteristica() {
		return this.caracteristica;
	}
	
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

}
