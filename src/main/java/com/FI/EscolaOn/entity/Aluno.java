package com.FI.EscolaOn.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

//import com.FI.EscolaOn.Enuns.NivelAcesso;
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
	private String niveldeacesso; //eu alterei porque nao funciona num metodo que eu fiz entao tive que mudar para string 
	private LocalDateTime dataDeCadastro;

	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

}
