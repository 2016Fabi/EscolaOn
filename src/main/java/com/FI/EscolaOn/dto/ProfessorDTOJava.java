package com.FI.EscolaOn.dto;

import com.FI.EscolaOn.Enuns.NivelAcesso;

import jakarta.validation.constraints.NotNull;

public record ProfessorDTOJava(@NotNull String nome, @NotNull String senha, @NotNull String cpf, @NotNull NivelAcesso nivelDeAcesso, @NotNull EnderecoDTOJava endereco) {
	
}
