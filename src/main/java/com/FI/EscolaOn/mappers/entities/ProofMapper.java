package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.response.ProofResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.ProofBuilder;
import com.FI.EscolaOn.dto.request.ProofRequestDTO;
import com.FI.EscolaOn.dto.response.ProofResponseDTO;
import com.FI.EscolaOn.entity.Proof;

public class ProofMapper {
	public static Proof fromProofRegisterRequest(ProofRequestDTO request) {
		return ProofBuilder.builder()
				.nameProof(request.getNameProof())
				.variantProof(request.getVariantProof())
				.questionsProof(request.getQuestionsProof())
				.build();
	}

	public static ProofResponseDTO fromProof(Proof entity) {
		return ProofResponseDTOBuilder.builder()
				.nameProof(entity.getNameProof())
				.variantProof(entity.getVariantProof())
				.questionsProof(entity.getQuestionsProof())
				.build();
	}
}
