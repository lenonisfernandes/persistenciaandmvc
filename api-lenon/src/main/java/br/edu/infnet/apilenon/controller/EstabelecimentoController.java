package br.edu.infnet.apilenon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apilenon.model.domain.Estabelecimento;
import br.edu.infnet.apilenon.model.service.EstabelecimentoService;

@RestController
@RequestMapping("/api/estabelecimento")
public class EstabelecimentoController {

	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Estabelecimento estabelecimento) {
		estabelecimentoService.incluir(estabelecimento);
		
	}
}
