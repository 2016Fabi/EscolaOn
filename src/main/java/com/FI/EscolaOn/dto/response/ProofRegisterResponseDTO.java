package com.FI.EscolaOn.dto.response;

import java.util.ArrayList;
import java.util.List;

public class ProofRegisterResponseDTO {
	
	private Long id;
	private String nameProof;
	private String variantProof;
	private List<String> questionsProof = new ArrayList<>();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameProof() {
		return nameProof;
	}

	public void setNameProof(String nameProof) {
		this.nameProof = nameProof;
	}

	public String getVariantProof() {
		return variantProof;
	}

	public void setVariantProof(String variantProof) {
		this.variantProof = variantProof;
	}

	public List<String> getQuestionsProof() {
		return questionsProof;
	}

	public void setQuestionsProof(List<String> questionsProof) {
		this.questionsProof = questionsProof;
	}

}
