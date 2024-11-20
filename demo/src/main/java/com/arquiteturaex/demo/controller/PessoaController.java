package com.arquiteturaex.demo.controller;

import com.arquiteturaex.demo.model.PessoaFisica;
import com.arquiteturaex.demo.model.PessoaJuridica;
import com.arquiteturaex.demo.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping("/fisica")
    public ResponseEntity<PessoaFisica> savePessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
        return ResponseEntity.ok(pessoaService.savePessoaFisica(pessoaFisica));
    }

    @PostMapping("/juridica")
    public ResponseEntity<PessoaJuridica> savePessoaJuridica(@RequestBody PessoaJuridica pessoaJuridica) {
        return ResponseEntity.ok(pessoaService.savePessoaJuridica(pessoaJuridica));
    }
}
