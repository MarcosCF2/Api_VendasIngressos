package com.example.vendasingressos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "pagamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "codigo", length = 150, nullable = false)
    private String codigo;

    @Column(name = "descricao", length = 200)
    private String descricao;

    @Column(name = "tipo_de_pagamento")
    private String tipoDePagamento;

    @OneToMany(mappedBy = "pagamento", targetEntity = Ingresso.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Ingresso> ingressos;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}


