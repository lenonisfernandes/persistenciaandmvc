package br.edu.infnet.votalenon.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votalenon.clients.IEleitorClient;
import br.edu.infnet.votalenon.model.domain.Eleitor;

@Service
public class EleitorService {
	
	@Autowired 
	private IEleitorClient eleitorClient;
	
	public void incluir(Eleitor eleitor) {
		eleitorClient.incluir(eleitor);
	}
	
	public List<Eleitor> obterLista() {
		return eleitorClient.obterLista();
	}
	
	public void excluir(Integer id) {
		eleitorClient.excluir(id);
	}

}
