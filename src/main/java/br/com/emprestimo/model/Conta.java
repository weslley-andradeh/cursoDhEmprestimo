package br.com.emprestimo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Cliente cliente;
	private BigDecimal saldo;
	private int numero;
	private int agencia;
	
	public Conta(Cliente cliente, BigDecimal saldo, int numero, int agencia) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public Conta() {
	}

	public int getId() {
		return id;
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
