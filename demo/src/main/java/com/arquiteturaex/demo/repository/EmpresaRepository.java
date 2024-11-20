package com.arquiteturaex.demo.repository;

import com.arquiteturaex.demo.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
