package br.com.emprestimo.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.emprestimo.model.Parcela;

public class ParcelaDto {
	
	private BigDecimal valor;
	private int numero;
	private LocalDate dataParcela;
	private boolean status;
	private int propostaId;
	
	public ParcelaDto(BigDecimal valor, LocalDate dataParcela, boolean status, int parcelaId) {
		this.valor = valor;
		this.numero = 1;
		this.dataParcela = dataParcela;
		this.status = status;
		this.propostaId = parcelaId;
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
	
	public Parcela converte() {
		Parcela parcela = new Parcela (valor, dataParcela, propostaId);
		return parcela;	
	}
	
}
