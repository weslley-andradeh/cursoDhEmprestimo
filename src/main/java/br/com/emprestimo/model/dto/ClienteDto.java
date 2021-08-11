package br.com.emprestimo.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.emprestimo.model.Cliente;
import br.com.emprestimo.model.Proposta;

public class ClienteDto {

	private String nome;
	private BigDecimal salario;
	private LocalDate dataContratacao;
	private BigDecimal patrimonio;
	private String cpf;
	private List<Proposta> propostas = new ArrayList<>();
	
	public ClienteDto(String nome, BigDecimal salario, LocalDate dataContratacao, BigDecimal patrimonio, String cpf,
			List<Proposta> propostas) {
		this.nome = nome;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
		this.patrimonio = patrimonio;
		this.cpf = cpf;
		this.propostas = propostas;
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
	
	public Cliente converte () {
		Cliente cliente = new Cliente (nome, salario, patrimonio, cpf);
		propostas.forEach(p -> cliente.adicionaProposta(p));
		return cliente;
	}
	
}
