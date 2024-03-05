package com.FI.EscolaOn.builders.dto;

import java.util.List;

import com.FI.EscolaOn.dto.response.ProofResponseDTO;


public class ProofResponseDTOBuilder {
	private ProofResponseDTO entity;

	public static ProofResponseDTOBuilder builder() {
		return new ProofResponseDTOBuilder();
	}

	public ProofResponseDTO build() {
		return this.entity;
	}

	public ProofResponseDTOBuilder id(Long id) {
		this.entity.setId(id);
		return this;
	}

	public ProofResponseDTOBuilder nameProof(String nameProof) {
		this.entity.setNameProof(nameProof);
		return this;
	}

	public ProofResponseDTOBuilder variantProof(String variantProof) {
		this.entity.setVariantProof(variantProof);
		return this;
	}

	public ProofResponseDTOBuilder questionsProof(List<String> questionsProof) {
		this.entity.setQuestionsProof(questionsProof);
		return this;
	}

}
