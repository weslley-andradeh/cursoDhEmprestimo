package br.com.emprestimo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parcela {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private BigDecimal valor;
	private int numero;
	private LocalDate dataParcela;
	private boolean status;
	private int propostaId;
	
	public Parcela(BigDecimal valor, LocalDate dataParcela, int propostaId) {
		this.valor = valor;
		this.numero = 1;
		this.dataParcela = dataParcela;
		this.propostaId = propostaId;
	}
	
	public Parcela() {
		
	}

	public int getId() {
		return id;
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
