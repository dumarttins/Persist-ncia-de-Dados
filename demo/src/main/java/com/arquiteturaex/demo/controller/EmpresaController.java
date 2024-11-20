package com.arquiteturaex.demo.controller;

import com.arquiteturaex.demo.model.Empresa;
import com.arquiteturaex.demo.service.EmpresaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping
    public List<Empresa> findAll() {
        return empresaService.findAll();
    }

    @PostMapping
    public ResponseEntity<Empresa> save(@RequestBody Empresa empresa) {
        return ResponseEntity.ok(empresaService.save(empresa));
    }
}
