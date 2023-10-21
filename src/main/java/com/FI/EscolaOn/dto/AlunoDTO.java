package com.FI.EscolaOn.dto;

import java.util.List;

import com.FI.EscolaOn.entity.Endereco;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AlunoDTO {

	@NotBlank(message = "{nome.not.blank}")
	private String nome;
	@NotBlank(message = "{senha.not.blank}")
	private String senha;
	@NotBlank(message = "{email.not.blank}")
	@Email(message = "{email.not.valid}")
	private String email;
	@NotBlank(message = "{cpf.not.blank}")
	private String cpf;
	private List<Long> curso;
	private Endereco endereco;
}
