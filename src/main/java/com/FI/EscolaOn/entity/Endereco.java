package com.FI.EscolaOn.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@SuppressWarnings("serial")
@Entity
@Transactional
@Data
@Table(name = "tb_endereco")
public class Endereco  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String provincia;

    @Column(nullable = false)
    private String municipio;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String rua;

    @OneToOne(mappedBy = "endereco")
    private Professor professor;

}
