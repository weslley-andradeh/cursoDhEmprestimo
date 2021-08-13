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

import br.com.emprestimo.model.Parcela;
import br.com.emprestimo.model.dto.ParcelaDto;
import br.com.emprestimo.service.ParcelaService;
import br.com.emprestimo.service.PropostaService;

@RestController
@RequestMapping("parcela/")
public class ParcelaController {
	
	private ParcelaService parcelaService;
	
	public ParcelaController(ParcelaService parcelaService) {
		this.parcelaService = parcelaService;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Parcela salvar(@RequestBody ParcelaDto parcelaDto) {
		Parcela parcela = parcelaDto.converte();
		return parcelaService.salvar(parcela);
	}
	
	@GetMapping("{id}")
	public Parcela buscarPorId(@PathVariable Integer id) {
		return parcelaService.buscarPorId(id);
	}
	
	@GetMapping
	public List<Parcela> buscarTodos(){
		return parcelaService.buscarTodos();
	}

}
