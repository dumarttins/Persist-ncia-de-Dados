package com.arquiteturaex.demo.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Usuario extends Pessoa {
    private String email;
    private String senha;
}
