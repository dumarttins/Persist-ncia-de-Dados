package com.arquiteturaex.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true) // Inclui os campos da superclasse no equals/hashCode
@Entity
public class PessoaFisica extends Usuario {
    private String cpf;
    private LocalDate dataNascimento;

    @ManyToMany(mappedBy = "pessoaFisicas")
    private List<Empresa> empresas;
}
