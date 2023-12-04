package com.FI.EscolaOn.dto;

import java.time.LocalDateTime;

import com.FI.EscolaOn.entity.Curso;
import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.entity.Professor;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CursoDTO {
	private Long id;
	@NotBlank
	private String curso;
	private int cargaHoraria;
	@NotBlank
	private String descricao;
	private LocalDateTime dataCadastroCurso;
	private Endereco endereco;
	private Long enderecoId;
	private Professor professor;
	private Long professorId;
	
	
	public CursoDTO() {
		
	}


	public CursoDTO(Curso c) {
		
		this.id = c.getId();
		this.curso = c.getCurso();
		this.cargaHoraria = c.getTempoAula();
		this.descricao = c.getDescricao();
		this.dataCadastroCurso = c.getDataCadastroCurso();
	}	
}
