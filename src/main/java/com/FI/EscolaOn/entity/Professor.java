package com.FI.EscolaOn.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.FI.EscolaOn.Enuns.NivelAcesso;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "tb_Professor")
public class Professor implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, unique = true, length = 150)
	private String nome;
	@Column(nullable = false, unique = true, length = 20)
	private String endereco;
	@Column(nullable = false, unique = true, length = 12)
	private String senha;
	@Column(nullable = false, unique = true, length = 15)
	private String cpf;
	@Column(nullable = false)
	private NivelAcesso nivelDeAcesso;
	private LocalDateTime dataDeCadastro;
	
   
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "tb_prova_professor", joinColumns = {
		@JoinColumn(name = "prova_id", referencedColumnName = "id")
	}, inverseJoinColumns = {
		@JoinColumn(name = "professor_id", referencedColumnName = "id")
	})
	@JsonIgnore
    private List<Prova> prova;

}
