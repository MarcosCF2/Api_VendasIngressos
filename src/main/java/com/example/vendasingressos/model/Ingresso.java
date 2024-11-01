package com.example.vendasingressos.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "contato", length = 100, nullable = false)
    private String contato;

    @Column(name = "endereco", length = 200)
    private String endereco;

    @Column(name = "tipo_do_ingresso")
    private String tipodoIngresso;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "pagamento_id")
    private Pagamento pagamento;
}
