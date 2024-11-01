package com.example.vendasingressos.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "vendasingressos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 500)
    private String Descricao;

    @Column(name = "data_inicio", nullable = false)
    private String dataInicio;

    @Column(name = "data_fim")
    private String dataFim;

    @OneToMany(mappedBy = "cliente", targetEntity = Pagamento.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Pagamento> pagamento;

}
