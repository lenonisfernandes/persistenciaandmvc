package br.edu.infnet.apiendereco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiendereco.model.domain.Endereco;
import br.edu.infnet.apiendereco.model.service.EnderecoService;

@Component
public class EnderecoLoader implements ApplicationRunner{
	@Autowired
	private EnderecoService enderecoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco endereco = new Endereco();
		
		try {
			endereco.setBairro("Centro");
			endereco.setCep("12345678");
			endereco.setComplemento("Segundo andar");
			endereco.setLocalicade("Rio de Janeiro");
			endereco.setLogradouro("São José, 90");
			endereco.setUf("RJ");
			
			enderecoService.incluir(endereco);
			
			System.out.println("Gravação do endereço realizada com sucesso!!!");
			
		} catch (Exception e) {
			
			System.out.println("Gravação do endereço não realizada!!!");
			
			//obterPorCep
			
			endereco.setCep("87654321");
			try {
				enderecoService.incluir(endereco);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		for(Endereco end : enderecoService.obterLista()) {
			System.out.println(end.toString());
		}
		
		try {
			enderecoService.excluir(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("\nDepois da exclusão:");
		for(Endereco end : enderecoService.obterLista()) {
			System.out.println(end.toString());
		}
		
		
	}
	
	

}
