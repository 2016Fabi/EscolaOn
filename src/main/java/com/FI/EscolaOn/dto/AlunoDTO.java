package com.FI.EscolaOn.dto;

import java.time.LocalDateTime;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Endereco;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AlunoDTO {
	private Long id;
	@NotBlank(message = "{nome.not.blank}")
	private String nome;
	@NotBlank(message = "{senha.not.blank}")
	private String senha;
	@NotBlank(message = "{email.not.blank}")
	@Email(message = "{email.not.valid}")
	private String email;
	@NotBlank(message = "{cpf.not.blank}")
	private String cpf;
	private String niveldeacesso;
	private LocalDateTime dataDeCadastro;
	private Endereco endereco;
	private Long enderecoId;
	
	
	public AlunoDTO() {
		
	}


	public AlunoDTO(Aluno aluno) {
		this.id = aluno.getId();
		this.nome = aluno.getEmail();
		this.senha = aluno.getSenha();
		this.email = aluno.getEmail(); 
		this.cpf = aluno.getCpf();
		this.niveldeacesso = aluno.getNiveldeacesso().toString();
		this.dataDeCadastro = aluno.getDataDeCadastro();
	}
	
	
	
	
	
}
