package br.uniesp.si.techback.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data //gerar get e setter , na hora que o código está compilando
@Table(name = "tb_usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nome;
    private Integer idade;
}