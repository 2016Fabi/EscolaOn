//package com.FI.EscolaOn.dto;
//
//import java.time.LocalDateTime;
//
//import com.FI.EscolaOn.entity.Course;
//import com.FI.EscolaOn.entity.Teacher;
//import com.FI.EscolaOn.entity.Address;
//
//import jakarta.validation.constraints.NotBlank;
//import lombok.Data;
//
//@Data
//public class CursoDTO {
//	private Long id;
//	@NotBlank
//	private String curso;
//	private int cargaHoraria;
//	@NotBlank
//	private String descricao;
//	private LocalDateTime dataCadastroCurso;
//	private Teacher endereco;
//	private Long enderecoId;
//	private Address professor;
//	private Long professorId;
//	
//	
//	public CursoDTO() {
//		
//	}
//
//
//	public CursoDTO(Course c) {
//		
//		this.id = c.getId();
//		this.curso = c.getCurso();
//		this.cargaHoraria = c.getTempoAula();
//		this.descricao = c.getDescricao();
//		this.dataCadastroCurso = c.getDataCadastroCurso();
//		this.endereco = c.getEndereco();
//		this.enderecoId = c.getEndereco().getId();
//		this.professor = c.getProfessor();
//		this.professorId = c.getProfessor().getId();
//		
//		
//	}	
//}
