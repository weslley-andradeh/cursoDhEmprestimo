package br.com.emprestimo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.emprestimo.model.Proposta;
import br.com.emprestimo.model.dto.ClienteDto;
import br.com.emprestimo.model.dto.PropostaDto;
import br.com.emprestimo.service.PropostaService;

@RestController
@RequestMapping("proposta/")
public class PropostaController {
	
private PropostaService propostaService;
	
	public PropostaController(PropostaService propostaService) {
		this.propostaService = propostaService;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Proposta salvar(@RequestBody PropostaDto propostaDto) {
		Proposta proposta = propostaDto.converte();
		return propostaService.salvar(proposta);
	}
	
	@GetMapping("{id}")
	public Proposta buscarPorId(@PathVariable Integer id) {
		return propostaService.buscarPorId(id);
	}
	
	@GetMapping
	public List<Proposta> buscarTodos(){
		return propostaService.buscarTodos();
	}
	
	@PostMapping("solicita")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<?> solicitarProposta(@RequestBody ClienteDto clienteDto, PropostaDto propostaDto, LocalDate dataParcela) throws Exception {
		Proposta proposta = propostaService.validaProposta(clienteDto, propostaDto, dataParcela);
		return ResponseEntity.ok(proposta);
		
	}

}
