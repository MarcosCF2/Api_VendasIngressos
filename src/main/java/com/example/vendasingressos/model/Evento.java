package com.example.vendasingressos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "evento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
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

    @OneToMany(mappedBy = "evento", targetEntity = Ingresso.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Ingresso> ingressos;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;
}
