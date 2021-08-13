package br.com.emprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emprestimo.model.Proposta;

public interface PropostaRepository extends JpaRepository<Proposta, Integer> {

}
