package br.edu.infnet.votalenon.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votalenon.model.domain.Candidato;
import br.edu.infnet.votalenon.model.domain.Eleicao;
import br.edu.infnet.votalenon.model.repository.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired CandidatoRepository candidatoRepository;
	
	public void incluir(Candidato candidato) {
		try {
			candidatoRepository.save(candidato);
			System.out.println("Inclusão realizada com sucesso: "+candidato.getNome());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public List<Candidato> obterLista() {
		return (List<Candidato>) candidatoRepository.findAll();
	}
	
	public List<Candidato> obterPorEleicao(Eleicao eleicao) {
		return (List<Candidato>) candidatoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		candidatoRepository.deleteById(id);
	}

}
