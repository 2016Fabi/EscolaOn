package com.FI.EscolaOn.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.FI.EscolaOn.Enuns.NivelAcesso;
import jakarta.persistence.*;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "tb_Aluno")
public class Aluno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, length = 150)
	private String nome;
	@Column(nullable = false)
	private String senha;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false, unique = true, length = 15)
	private String cpf;
	@Column(nullable = false)
	private NivelAcesso niveldeacesso; 
	private LocalDateTime dataDeCadastro;

	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "tb_aluno_curso", joinColumns = {
			@JoinColumn(name = "aluno_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "curso_id", referencedColumnName = "id") })
	private List<Curso> curso;
	

	public Aluno() {
		
	}

	public Aluno(Long id, String nome, String senha, String email, String cpf, NivelAcesso niveldeacesso,
			LocalDateTime dataDeCadastro, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.cpf = cpf;
		this.niveldeacesso = niveldeacesso;
		this.dataDeCadastro = dataDeCadastro;
		this.endereco = endereco;
	}
	
	
	

}
