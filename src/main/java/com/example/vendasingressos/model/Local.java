package com.example.vendasingressos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "local")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "contato", length = 150, nullable = false)
    private String contato;

    @Column(name = "descricao", length = 200)
    private String descricao;

    @Column(name = "tipo_do_local")
    private String tipoDoLocal;

    @OneToMany(mappedBy = "local", targetEntity = Evento.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Evento> eventos;
}
