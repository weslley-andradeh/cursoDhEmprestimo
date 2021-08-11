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

import br.com.emprestimo.model.Cliente;
import br.com.emprestimo.model.dto.ClienteDto;
import br.com.emprestimo.service.ClienteService;

@RestController
@RequestMapping("cliente/")
public class ClienteController {
	
	
	private ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cliente salvar(@RequestBody ClienteDto clienteDto) {
		Cliente cliente = clienteDto.converte();
		return clienteService.salvar(cliente);
	}
	
	@GetMapping("{id}")
	public Cliente buscarPorId(@PathVariable Integer id) {
		return clienteService.buscarPorId(id);
	}
	
	@GetMapping
	public List<Cliente> buscarTodos(){
		return clienteService.buscarTodos();
	}
	
}
