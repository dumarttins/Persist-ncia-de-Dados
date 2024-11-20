package com.arquiteturaex.demo.repository;

import com.arquiteturaex.demo.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
}
