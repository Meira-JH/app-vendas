package meirajh.appvendas.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import meirajh.appvendas.domain.Eletronico;


@Service
public class EletronicoService {

	private Map<Integer, Eletronico> mapaEletronico = new HashMap<Integer, Eletronico>();

	public void incluir(Eletronico eletronico) {
		mapaEletronico.put(eletronico.getCodigo(), eletronico);
	}
	
	public Collection<Eletronico> obterLista(){	
		return mapaEletronico.values();
	}
}