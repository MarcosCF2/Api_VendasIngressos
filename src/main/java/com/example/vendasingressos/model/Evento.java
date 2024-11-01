package com.example.vendasingressos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "contato", length = 100, nullable = false)
    private String contato;

    @Column(name = "endereco", length = 200)
    private String endereco;

    @Column(name = "tipo_de_evente")
    private String tipodeEvento;

    @OneToMany(mappedBy = "evento", targetEntity = Evento.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Evento> eventos;
}
