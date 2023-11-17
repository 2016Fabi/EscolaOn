package com.FI.EscolaOn.dto;

import com.FI.EscolaOn.entity.Endereco;

//import com.FI.EscolaOn.entity.Professor;

import lombok.Data;

@Data
public class EnderecoDTO {
	
	private String provincia;
	private String municipio;
	private String bairro;
	private String rua;
	//private Professor professor;
	
	public EnderecoDTO() {
		
	}
	
	
	public EnderecoDTO(Endereco endereco) {
		this.provincia = endereco.getProvincia();
		this.municipio = endereco.getMunicipio();
		this.bairro = endereco.getBairro();
		this.rua = endereco.getRua();
	}
	
}
