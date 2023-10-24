package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Alimenticio;

@Service
public class AlimenticioService {

	private Map<Integer, Alimenticio> mapaAlimenticio = new HashMap<Integer, Alimenticio>();

	public void incluir(Alimenticio alimenticio) {
		mapaAlimenticio.put(alimenticio.getCodigo(), alimenticio);
	}
	
	public Collection<Alimenticio> obterLista(){	
		return mapaAlimenticio.values();
	}
}