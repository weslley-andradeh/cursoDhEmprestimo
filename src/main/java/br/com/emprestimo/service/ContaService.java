package br.com.emprestimo.service;

import java.util.List;

import br.com.emprestimo.model.Conta;

public interface ContaService {
	
	public Conta salvar(Conta conta);

	public Conta buscarPorId(Integer id);

	public List<Conta> buscarTodos();

}
