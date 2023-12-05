package com.FI.EscolaOn.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Transactional
@Data
@Table(name = "tb_Endereco")
public class Endereco implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String provincia;

	@Column(nullable = false)
	private String municipio;

	@Column(nullable = false)
	private String bairro;

	@Column(nullable = false)
	private String rua;

	@OneToOne(mappedBy = "endereco")
	@JsonIgnore
	private Professor professor;
	
	@OneToOne(mappedBy = "endereco")
	@JsonIgnore
	private Aluno aluno;
	
	@OneToOne(mappedBy = "endereco")
	@JsonIgnore
	private Curso curso;;

	public Endereco() {
	
	}


	public Endereco(Long id, String provincia, String municipio, String bairro, String rua, Professor professor,
			Aluno aluno, Curso curso) {
		this.id = id;
		this.provincia = provincia;
		this.municipio = municipio;
		this.bairro = bairro;
		this.rua = rua;
		this.professor = professor;
		this.aluno = aluno;
		this.curso = curso;
	}
	
	
	
	
	
}
