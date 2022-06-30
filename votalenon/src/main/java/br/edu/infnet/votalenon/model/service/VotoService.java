package br.edu.infnet.votalenon.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votalenon.clients.IVotoClient;
import br.edu.infnet.votalenon.model.domain.Voto;

@Service
public class VotoService {
	
	@Autowired 
	private IVotoClient votoClient;
	
	public void incluir(Voto voto) {
		votoClient.incluir(voto);
	}
	
	public List<Voto> obterLista() {
		return votoClient.obterLista();
	}
	
	public void excluir(Integer id) {
		votoClient.excluir(id);
	}

}
