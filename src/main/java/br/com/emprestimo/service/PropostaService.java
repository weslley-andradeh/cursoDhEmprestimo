package br.com.emprestimo.service;

import java.time.LocalDate;
import java.util.List;

import br.com.emprestimo.model.Proposta;
import br.com.emprestimo.model.dto.ClienteDto;
import br.com.emprestimo.model.dto.PropostaDto;

public interface PropostaService {

	public Proposta salvar(Proposta proposta);

	public Proposta buscarPorId(Integer id);

	public List<Proposta> buscarTodos();
	
	public Proposta validaProposta(ClienteDto clienteDto, PropostaDto propostaDto, LocalDate dataParcela) throws Exception;

}
