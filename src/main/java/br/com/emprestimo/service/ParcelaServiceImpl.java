package br.com.emprestimo.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import br.com.emprestimo.model.Parcela;
import br.com.emprestimo.repository.ParcelaRepository;

public class ParcelaServiceImpl implements ParcelaService {
	
	private final ParcelaRepository parcelaRepository;

	public ParcelaServiceImpl(ParcelaRepository parcelaRepository) {
		this.parcelaRepository = parcelaRepository;
	}

	@Override
	public Parcela salvar(Parcela parcela) {
		return parcelaRepository.save(parcela);
	}

	@Override
	public Parcela buscarPorId(Integer id) {
		return parcelaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não existe categoria com o id " + id));
	}

	@Override
	public List<Parcela> buscarTodos() {
		return parcelaRepository.findAll();
	}

}
