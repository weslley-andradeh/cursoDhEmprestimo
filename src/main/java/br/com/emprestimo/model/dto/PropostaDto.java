package br.com.emprestimo.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.emprestimo.model.Cliente;

public class PropostaDto {

	private BigDecimal valor;
	private Double taxaJuros;
	private int quantidadeParcelas;
	private Cliente cliente;
	private LocalDate dataContratacao;
	private boolean status;
	
	public PropostaDto(BigDecimal valor, Double taxaJuros, int quantidadeParcelas, Cliente cliente,
			LocalDate dataContratacao, boolean status) {
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.quantidadeParcelas = quantidadeParcelas;
		this.cliente = cliente;
		this.dataContratacao = dataContratacao;
		this.status = status;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Double getTaxaJuros() {
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
	
	public void converte() {
		
	}
	
}
