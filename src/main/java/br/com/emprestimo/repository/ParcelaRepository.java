package br.com.emprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emprestimo.model.Parcela;

public interface ParcelaRepository extends JpaRepository<Parcela, Integer> {

}
