package br.edu.infnet.votalenon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.votalenon.model.domain.Voto;
import br.edu.infnet.votalenon.model.service.EleitorService;
import br.edu.infnet.votalenon.model.service.VotoService;

@Controller
public class VotoController {
	
	@Autowired
	private VotoService votoService;
	@Autowired
	private EleitorService eleitorService;
	
	@GetMapping(value = "/voto")
	public String cadastro(Model model) {
		model.addAttribute("eleitores", eleitorService.obterLista());
		return "voto/cadastro";
	}
	
	@PostMapping(value = "/voto/incluir")
	public String incluir(Voto voto) {
		
		votoService.incluir(voto);
		System.out.println("Inclusão realizada com sucesso: "+voto.getLocalizacao());
		
		return "redirect:/votos";
	}
	
	@GetMapping(value = "/votos")
	private String lista(Model model) {
		
		model.addAttribute("lista", votoService.obterLista());
		
		return "voto/lista";
	}

	@GetMapping(value = "/voto/{id}/excluir")
	private String excluir(@PathVariable Integer id) {
		votoService.excluir(id);
		return "redirect:/votos";
	}
}
