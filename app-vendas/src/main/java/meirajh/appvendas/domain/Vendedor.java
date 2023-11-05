package meirajh.appvendas.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TVendedor")
public class Vendedor extends Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;
	private List<Produto> produtos;

	public String toString() {
		return String.format("%s - %s - %s", nome, super.getId(), email);
	}

}
