package br.com.emprestimo.model.dto;

import java.math.BigDecimal;

import br.com.emprestimo.model.Cliente;

public class ContaDto {
	
	private Cliente cliente;
	private BigDecimal saldo;
	private int numero;
	private int agencia;
	
	public ContaDto(Cliente cliente, BigDecimal saldo, int numero, int agencia) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}
	
}
