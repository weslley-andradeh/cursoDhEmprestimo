package br.com.emprestimo.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import br.com.emprestimo.model.Conta;
import br.com.emprestimo.repository.ContaRepository;

public class ContaServiceImpl implements ContaService {
	
	private final ContaRepository contaRepository;

	public ContaServiceImpl(ContaRepository contaRepository) {
		this.contaRepository = contaRepository;
	}

	@Override
	public Conta salvar(Conta conta) {
		return contaRepository.save(conta);
	}

	@Override
	public Conta buscarPorId(Integer id) {
		return contaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não existe categoria com o id " + id));
	}

	@Override
	public List<Conta> buscarTodos() {
		return contaRepository.findAll();
	}

}
