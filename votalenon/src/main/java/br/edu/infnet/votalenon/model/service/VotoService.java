package br.edu.infnet.votalenon.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votalenon.model.domain.Voto;
import br.edu.infnet.votalenon.model.repository.VotoRepository;

@Service
public class VotoService {
	
	@Autowired VotoRepository votoRepository;
	
	public void incluir(Voto voto) {
		votoRepository.save(voto);
	}
	
	public List<Voto> obterLista() {
		return (List<Voto>) votoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		votoRepository.deleteById(id);
	}

}
