package br.com.emprestimo.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private BigDecimal salario;
	private LocalDate dataContratacao;
	private BigDecimal patrimonio;
	private String cpf;
	
	@OneToMany(mappedBy = "cliente")
	private List<Proposta> propostas = new ArrayList<>();
	
	public Cliente(String nome, BigDecimal salario, BigDecimal patrimonio, String cpf) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.patrimonio = patrimonio;
		this.cpf = cpf;
	}
	
	public Cliente() {
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public BigDecimal getPatrimonio() {
		return patrimonio;
	}

	public String getCpf() {
		return cpf;
	}

	public List<Proposta> getPropostas() {
		return propostas;
	}

	public void adicionaProposta(Proposta proposta) {
		propostas.add(proposta);
	}
	
}
