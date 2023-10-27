package com.FI.EscolaOn.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

//import com.FI.EscolaOn.Enuns.NivelAcesso;

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
	private String nivelDeAcesso; //eu alterei porque nao funciona num metodo que eu fiz entao tive que mudar para string 
	private LocalDateTime dataDeCadastro;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;
	
	
}
