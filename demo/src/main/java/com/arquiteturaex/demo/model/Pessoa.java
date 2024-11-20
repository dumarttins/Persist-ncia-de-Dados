package com.arquiteturaex.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@MappedSuperclass
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
}
