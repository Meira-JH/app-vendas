package meirajh.appvendas.domain;


public class Eletronico extends Produto {

	private String marca;
	private int garantiaMeses;

	@Override
	public String toString() {
		return String.format("%s - %s - %d", super.toString(), marca, garantiaMeses);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
}