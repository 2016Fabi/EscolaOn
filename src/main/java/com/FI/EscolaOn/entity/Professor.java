package com.FI.EscolaOn.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.FI.EscolaOn.Enuns.NivelAcesso;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Transactional
@Data
@Table(name = "tb_Professor")
public class Professor implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, unique = true, length = 150)
	private String nome;
	@Column(nullable = false, unique = true, length = 12)
	private String senha;
	@Column(nullable = false, unique = true, length = 15)
	private String cpf;
	@Column(nullable = false)
	private NivelAcesso nivelDeAcesso; 
	private LocalDateTime dataDeCadastro;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;

	public Professor() {
		
	}

	public Professor(Long id, String nome, String senha, String cpf, NivelAcesso nivelDeAcesso,
			LocalDateTime dataDeCadastro) {		
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
		this.nivelDeAcesso = nivelDeAcesso;
		this.dataDeCadastro = dataDeCadastro;
	}
	
	
}
