package br.com.emprestimo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Proposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private BigDecimal valor;
	private BigDecimal taxaJuros;
	private int quantidadeParcelas;
	
	@OneToMany(mappedBy = "proposta")
	private Parcela parcela;

	@ManyToOne
	private Cliente cliente;

	private LocalDate dataContratacao;
	private int tempoMinimoContratacao;
	private boolean status;

	public Proposta(BigDecimal valor, BigDecimal taxaJuros, int quantidadeParcelas, Cliente cliente) {
		super();
		this.valor = valor;
		this.taxaJuros = taxaJuros;
		this.quantidadeParcelas = quantidadeParcelas;
		this.cliente = cliente;
		this.dataContratacao = LocalDate.now();
		this.tempoMinimoContratacao = 3; 
	}
	
	public Proposta() {
		
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

	public int getTempoMinimoContratacao() {
		return tempoMinimoContratacao;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
