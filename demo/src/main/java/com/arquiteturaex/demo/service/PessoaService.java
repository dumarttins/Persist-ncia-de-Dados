package com.arquiteturaex.demo.service;

import com.arquiteturaex.demo.model.PessoaFisica;
import com.arquiteturaex.demo.model.PessoaJuridica;
import com.arquiteturaex.demo.repository.PessoaFisicaRepository;
import com.arquiteturaex.demo.repository.PessoaJuridicaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    private final PessoaFisicaRepository pessoaFisicaRepository;
    private final PessoaJuridicaRepository pessoaJuridicaRepository;

    public PessoaService(PessoaFisicaRepository pessoaFisicaRepository, PessoaJuridicaRepository pessoaJuridicaRepository) {
        this.pessoaFisicaRepository = pessoaFisicaRepository;
        this.pessoaJuridicaRepository = pessoaJuridicaRepository;
    }

    public PessoaFisica savePessoaFisica(PessoaFisica pessoaFisica) {
        return pessoaFisicaRepository.save(pessoaFisica);
    }

    public PessoaJuridica savePessoaJuridica(PessoaJuridica pessoaJuridica) {
        return pessoaJuridicaRepository.save(pessoaJuridica);
    }
}
