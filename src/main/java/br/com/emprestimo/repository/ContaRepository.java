package br.com.emprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emprestimo.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Integer> {

}
