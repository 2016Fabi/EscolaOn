package com.FI.EscolaOn.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AlunoDTO {

	@NotBlank(message = "{nome.not.blank}")
	private String nome;
	@NotBlank(message = "{endereco.not.blank}")
	private String endereco;
	@NotBlank(message = "{senha.not.blank}")
	private String senha;
	@NotBlank(message = "{email.not.blank}")
	@Email(message = "{email.not.valid}")
	private String email;
	@NotBlank(message = "{cpf.not.blank}")
	private String cpf;
}
