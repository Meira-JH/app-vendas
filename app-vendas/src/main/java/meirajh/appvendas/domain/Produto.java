package meirajh.appvendas.domain;

public class Produto {

	protected Integer id;
	protected String descricao;
	protected int codigo;
	protected float preco;
	protected boolean estoque;
	
	@Override
	public String toString() {
		return String.format("%s - %d - %.2f - %s", descricao, codigo, preco, estoque);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public boolean isEstoque() {
		return estoque;
	}
	
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}
	
}
