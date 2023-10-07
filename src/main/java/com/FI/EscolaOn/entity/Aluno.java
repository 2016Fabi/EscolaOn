package com.FI.EscolaOn.entity;


import java.io.Serializable;
import java.time.LocalDateTime;

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
	@Column(nullable = false, unique = true, length = 150)
	private String nome;
	@Column(nullable = false, unique = true, length = 20)
	private String endereco;
	@Column(nullable = false, unique = true, length = 12)
	private String senha;
	private String email;
	@Column(nullable = false, length = 15)
	private String cpf;
	@Column(nullable = false)
	private NivelAcesso niveldeacesso;
	private LocalDateTime dataDeCadastro;
}
