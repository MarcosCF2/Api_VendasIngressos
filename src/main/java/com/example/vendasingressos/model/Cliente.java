package com.example.vendasingressos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vendasingressos")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 500)
    private String Descricao;

    @Column(name = "data_inicio", nullable = false)
    private String dataInicio;

    @Column(name = "data_fim")
    private String dataFim;

}
