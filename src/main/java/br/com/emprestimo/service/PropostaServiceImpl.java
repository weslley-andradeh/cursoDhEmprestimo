package br.com.emprestimo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import br.com.emprestimo.model.Parcela;
import br.com.emprestimo.model.Proposta;
import br.com.emprestimo.model.dto.ClienteDto;
import br.com.emprestimo.model.dto.PropostaDto;
import br.com.emprestimo.repository.PropostaRepository;

public class PropostaServiceImpl implements PropostaService {

	private final PropostaRepository propostaRepository;

	public PropostaServiceImpl(PropostaRepository propostaRepository) {
		this.propostaRepository = propostaRepository;
	}

	@Override
	public Proposta salvar(Proposta proposta) {
		return propostaRepository.save(proposta);
	}

	@Override
	public Proposta buscarPorId(Integer id) {
		return propostaRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Não existe categoria com o id " + id));
	}

	@Override
	public List<Proposta> buscarTodos() {
		return propostaRepository.findAll();
	}

	public Proposta validaProposta(ClienteDto clienteDto, PropostaDto propostaDto, LocalDate dataParcela) throws Exception {
		if(propostaDto.getValor().compareTo(BigDecimal.ZERO) != 1 || propostaDto.getQuantidadeParcelas() <= 0) {
			throw new Exception("Valor ou quantidade de parcelas deve ser maior que 0!!");
		}
		
		BigDecimal valorParcela = propostaDto.getValor().multiply(propostaDto.getTaxaJuros()).multiply(new BigDecimal(propostaDto.getQuantidadeParcelas() / 12));
	
		Parcela parcela = new Parcela(valorParcela, dataParcela, propostaDto.getId());
				
		if (clienteDto.getTempoServico() < propostaDto.getTempoMinimoContratacao() || 
			clienteDto.getPatrimonio().compareTo(propostaDto.getValor()) == -1 ||
			parcela.getValor().compareTo(clienteDto.getSalario().multiply(new BigDecimal(0.15))) == 1)
			 {
			throw new Exception("Proposta recusada!");
		}
			
			Proposta proposta = propostaDto.converte();
			
			proposta.setParcela(parcela);
			proposta.setStatus(true);
			
			return proposta;
		}

}
