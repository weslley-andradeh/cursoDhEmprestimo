package br.com.emprestimo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.emprestimo.model.Conta;
import br.com.emprestimo.model.dto.ContaDto;
import br.com.emprestimo.service.ContaService;

@RestController
@RequestMapping("conta/")
public class ContaController {

private ContaService contaService;
	
	public ContaController(ContaService contaService) {
		this.contaService = contaService;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Conta salvar(@RequestBody ContaDto contaDto) {
		Conta conta = contaDto.converte();
		return contaService.salvar(conta);
	}
	
	@GetMapping("{id}")
	public Conta buscarPorId(@PathVariable Integer id) {
		return contaService.buscarPorId(id);
	}
	
	@GetMapping
	public List<Conta> buscarTodos(){
		return contaService.buscarTodos();
	}

}
