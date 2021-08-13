package br.com.emprestimo.service;

import java.util.List;

import br.com.emprestimo.model.Parcela;

public interface ParcelaService {

	public Parcela salvar(Parcela parcela);

	public Parcela buscarPorId(Integer id);

	public List<Parcela> buscarTodos();
	
}
