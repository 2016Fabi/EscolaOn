package com.FI.EscolaOn.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.entity.Professor;

import lombok.Data;

@Data
public class ProfessorDTO {
	private Long id; 
	private String nome;
	private String senha;
	private String cpf;
	private String nivelDeAcesso;
	private LocalDateTime dataDeCadastro;
	private EnderecoDTO endereco;
	
	public ProfessorDTO() {
		
	}
	
	@SuppressWarnings("unchecked")
	public ProfessorDTO(Professor professor) {
		this.id = professor.getId();
		this.nome = professor.getNome();
		this.senha = professor.getSenha();
		this.cpf = professor.getCpf();
		this.nivelDeAcesso = professor.getNivelDeAcesso().toString();
		this.dataDeCadastro = professor.getDataDeCadastro();
		this.endereco = (EnderecoDTO) this.converteParaEnderecoDTO((List<Endereco>) professor.getEndereco());
	}
	
	private List<EnderecoDTO> converteParaEnderecoDTO(List<Endereco> end) {
		List<EnderecoDTO> enderecoDTO = new ArrayList<EnderecoDTO>();
		enderecoDTO =  end.stream().map(endereco -> new EnderecoDTO(endereco)).collect(Collectors.toList());;
		return enderecoDTO;
	}
	
}
