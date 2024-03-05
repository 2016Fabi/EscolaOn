package com.FI.EscolaOn.dto.request;

import java.util.ArrayList;
import java.util.List;

public class ProofRequestDTO {
	
	private String nameProof;
	private String variantProof;
	private List<String> questionsProof  = new ArrayList<>();
	
	
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
