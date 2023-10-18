package com.FI.EscolaOn.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "tb_curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private String descricao;

    private LocalDateTime dataCadastroCurso;

    @Column(nullable = false)
    private int tempoAula;

    @ManyToOne
    @JoinColumn(name = "prof_id")
    @JsonIgnore
    private Professor professor;
}
