package br.edu.infnet.votalenon.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votalenon.clients.IEleicaoClient;
import br.edu.infnet.votalenon.model.domain.Eleicao;

@Service
public class EleicaoService {
	
	@Autowired 
	private IEleicaoClient eleicaoClient;
	
	public void incluir(Eleicao eleicao) {
		eleicaoClient.incluir(eleicao);
	}
	
	public Eleicao obterPorId(int id) {
		return eleicaoClient.obterPorId(id);
	}
	
	public List<Eleicao> obterLista() {
		return eleicaoClient.obterLista();
	}
	
	public void excluir(Integer id) {
		eleicaoClient.excluir(id);
	}

}
