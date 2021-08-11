package br.com.emprestimo.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ParcelaDto {
	
	private BigDecimal valor;
	private int numero;
	private LocalDate dataParcela;
	private boolean status;
	private int propostaId;
	
	public ParcelaDto(BigDecimal valor, int numero, LocalDate dataParcela, boolean status, int propostaId) {
		this.valor = valor;
		this.numero = numero;
		this.dataParcela = dataParcela;
		this.status = status;
		this.propostaId = propostaId;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getNumero() {
		return numero;
	}

	public LocalDate getDataParcela() {
		return dataParcela;
	}

	public boolean isStatus() {
		return status;
	}

	public int getPropostaId() {
		return propostaId;
	}
	
}
