package com.FI.EscolaOn.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_Curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String curso;

	@Column(nullable = false)
	private String descricao;

	private LocalDateTime dataCadastroCurso;

	@Column(nullable = false)
	private int tempoAula;

	@ManyToOne
	@JoinColumn(name = "professor_id")
	@JsonIgnore
	private Professor professor;


}
