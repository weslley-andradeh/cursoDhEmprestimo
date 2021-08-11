package br.com.emprestimo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Proposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private BigDecimal valor;
	private Double taxaJuros;
	private int quantidadeParcelas;

	@ManyToOne
	private Cliente cliente;

	private LocalDate dataContratacao;
	private boolean status;

	public Proposta(BigDecimal valor, Double taxaJuros, int quantidadeParcelas, Cliente cliente) {
		super();
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.quantidadeParcelas = quantidadeParcelas;
		this.cliente = cliente;
		this.dataContratacao = LocalDate.now();
	}
	
	public Proposta() {
		
	}

	public int getId() {
		return id;
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
	
}
