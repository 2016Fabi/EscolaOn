package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.ProofRegisterResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.ProofBuilder;
import com.FI.EscolaOn.dto.request.ProofRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.ProofRegisterResponseDTO;
import com.FI.EscolaOn.entity.Proof;

public class ProofMapper {
	public static Proof fromProofRegisterRequest(ProofRegisterRequestDTO request) {
		return ProofBuilder.builder()
				.nameProof(request.getNameProof())
				.variantProof(request.getVariantProof())
				.questionsProof(request.getQuestionsProof())
				.build();
	}

	public static ProofRegisterResponseDTO fromProof(Proof entity) {
		return ProofRegisterResponseDTOBuilder.builder()
				.nameProof(entity.getNameProof())
				.variantProof(entity.getVariantProof())
				.questionsProof(entity.getQuestionsProof())
				.build();
	}
}
