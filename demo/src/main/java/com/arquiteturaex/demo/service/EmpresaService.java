package com.arquiteturaex.demo.service;

import com.arquiteturaex.demo.model.Empresa;
import com.arquiteturaex.demo.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
}
