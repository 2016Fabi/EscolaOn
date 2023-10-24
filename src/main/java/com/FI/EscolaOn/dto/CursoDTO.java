package com.FI.EscolaOn.dto;

import java.util.List;

import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.entity.Professor;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CursoDTO {
	@NotBlank
	private String curso;
	private int cargaHoraria;
	@NotBlank
	private String descricao;
	private Professor professor;
	private List<Long> aluno;
	private List<Long> prova;
	private Endereco endereco;
}
