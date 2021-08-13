package br.com.emprestimo.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.emprestimo.model.Cliente;
import br.com.emprestimo.model.Proposta;

public class PropostaDto {

	private int id;
	private BigDecimal valor;
	private BigDecimal taxaJuros;
	private int quantidadeParcelas;
	private Cliente cliente;
	private LocalDate dataContratacao;
	private int tempoMinimoContratacao;
	private boolean status;
	
	public PropostaDto(BigDecimal valor, BigDecimal taxaJuros, int quantidadeParcelas, Cliente cliente,
			LocalDate dataContratacao, boolean status) {
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.quantidadeParcelas = quantidadeParcelas;
		this.cliente = cliente;
		this.dataContratacao = dataContratacao;
		this.status = status;
		this.tempoMinimoContratacao = 3;
	}
	
	public int getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public BigDecimal getTaxaJuros() {
		return taxaJuros;
	}

	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public boolean isStatus() {
		return status;
	}
	
	public Proposta converte() {
		Proposta proposta = new Proposta (valor, taxaJuros, quantidadeParcelas, cliente);
		return proposta;	
	}

	public int getTempoMinimoContratacao() {
		return tempoMinimoContratacao;
	}
	
}
