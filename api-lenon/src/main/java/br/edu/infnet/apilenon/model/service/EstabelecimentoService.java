package br.edu.infnet.apilenon.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apilenon.model.domain.Estabelecimento;
import br.edu.infnet.apilenon.model.repository.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	public void incluir(Estabelecimento estabelecimento) {
		estabelecimentoRepository.save(estabelecimento);
	}
	
	public List<Estabelecimento> obterLista() {
		return (List<Estabelecimento>) estabelecimentoRepository.findAll();
	}
}
