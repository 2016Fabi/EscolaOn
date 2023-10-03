package com.FI.EscolaOn.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.FI.EscolaOn.Enuns.NivelAcesso;
import jakarta.persistence.*;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "tb_Professor")
public class Professor implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
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
	private List<Prova> prova;

}
