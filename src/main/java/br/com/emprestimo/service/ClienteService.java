package br.com.emprestimo.service;

import java.util.List;

import br.com.emprestimo.model.Cliente;

public interface ClienteService {

	public Cliente salvar(Cliente cliente);

	public Cliente buscarPorId(Integer id);

	public List<Cliente> buscarTodos();
	
}
