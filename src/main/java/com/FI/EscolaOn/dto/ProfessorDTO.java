//package com.FI.EscolaOn.dto;
//
//import java.time.LocalDateTime;
//import com.FI.EscolaOn.entity.Teacher;
//import com.FI.EscolaOn.entity.Address;
//
//import lombok.Data;
//
//@Data
//public class ProfessorDTO {
//	private Long id; 
//	private String nome;
//	private String senha;
//	private String cpf;
//	private String nivelDeAcesso;
//	private LocalDateTime dataDeCadastro;
//	private Teacher endereco;
//	private Long enderecoId;
//	
//	public ProfessorDTO() {
//		
//	}
//	
//	public ProfessorDTO(Address professor) {
//		this.id = professor.getId();
//		this.nome = professor.getNome();
//		this.senha = professor.getSenha();
//		this.cpf = professor.getCpf();
//		this.nivelDeAcesso = professor.getNivelDeAcesso().toString();
//		this.dataDeCadastro = professor.getDataDeCadastro();
//		this.endereco = professor.getEndereco();
//		this.enderecoId = professor.getEndereco().getId();
//	}
//	
//}
