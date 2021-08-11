package br.com.emprestimo.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import br.com.emprestimo.model.Cliente;
import br.com.emprestimo.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	private final ClienteRepository clienteRepository;

	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		return clienteRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não existe categoria com o id " + id));
	}

	@Override
	public List<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

}
