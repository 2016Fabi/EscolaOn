package com.FI.EscolaOn.builders.dto;

import java.util.List;

import com.FI.EscolaOn.dto.response.ProofRegisterResponseDTO;

public class ProofRegisterResponseDTOBuilder {
	private ProofRegisterResponseDTO entity;

	public static ProofRegisterResponseDTOBuilder builder() {
		return new ProofRegisterResponseDTOBuilder();
	}

	public ProofRegisterResponseDTO build() {
		return this.entity;
	}

	public ProofRegisterResponseDTOBuilder id(Long id) {
		this.entity.setId(id);
		return this;
	}

	public ProofRegisterResponseDTOBuilder nameProof(String nameProof) {
		this.entity.setNameProof(nameProof);
		return this;
	}

	public ProofRegisterResponseDTOBuilder variantProof(String variantProof) {
		this.entity.setVariantProof(variantProof);
		return this;
	}

//	public ProofRegisterResponseDTOBuilder questionsProof(List<String> questionsProof) {
//		this.entity.setQuestionsProof(new ProofRegisterResponseDTO(questionsProof));
//		return this;
//	}

}
