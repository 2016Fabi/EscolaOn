package com.FI.EscolaOn.entity;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import com.FI.EscolaOn.Enuns.NivelAcesso;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "tb_Aluno")
public class Aluno implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

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
}
