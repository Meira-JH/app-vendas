package meirajh.appvendas.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import meirajh.appvendas.domain.Suplemento;

@Service
public class SuplementoService {
	
	private Map<Integer, Suplemento> mapaSuplemento = new HashMap<Integer, Suplemento>();

	public void incluir(Suplemento suplemento) {
		mapaSuplemento.put(suplemento.getId(), suplemento);
	}
	
	public Collection<Suplemento> obterLista(){	
		return mapaSuplemento.values();
	}

}
