package br.edu.infnet.votalenon.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votalenon.clients.ICandidatoClient;
import br.edu.infnet.votalenon.model.domain.Candidato;
import br.edu.infnet.votalenon.model.domain.Eleicao;

@Service
public class CandidatoService {
	
	@Autowired 
	private ICandidatoClient candidatoClient;
	
	public void incluir(Candidato candidato) {
		candidatoClient.incluir(candidato);
	}
	
	public List<Candidato> obterLista() {
		return candidatoClient.obterLista();
	}
	
	public List<Candidato> obterPorEleicao(Eleicao eleicao) {
		return candidatoClient.obterPorEleicao(eleicao.getId());
	}
	
	public void excluir(Integer id) {
		candidatoClient.excluir(id);
	}

}
