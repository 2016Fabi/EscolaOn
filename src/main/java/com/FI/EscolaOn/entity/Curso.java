package com.FI.EscolaOn.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	public Curso() {
		
	}

	public Curso(Long id, String curso, String descricao, LocalDateTime dataCadastroCurso, int tempoAula,
			Endereco endereco) {
		this.id = id;
		this.curso = curso;
		this.descricao = descricao;
		this.dataCadastroCurso = dataCadastroCurso;
		this.tempoAula = tempoAula;
		this.endereco = endereco;
	}
	

	@ManyToOne
	@JoinColumn(name = "professor_id")
	private Professor professor;
	
	


}
