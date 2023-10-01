package com.FI.EscolaOn.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AlunoDTO {

	@NotBlank
	private String nome;
	@NotBlank
	private String endereco;
	@NotBlank
	private String senha;
	@NotBlank
	private String cpf;
	@NotBlank
	private String nivelDeAcesso;

}
