package com.arquiteturaex.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true) // Inclui os campos da superclasse no equals/hashCode
@Entity
public class PessoaJuridica extends Usuario {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    @ManyToOne
    private Empresa empresa;
}
