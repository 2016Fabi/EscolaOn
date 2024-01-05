package com.FI.EscolaOn.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.FI.EscolaOn.entity.Proof;

public class ProofResponseFindAllDTO {
	private Long id;
	private String nameProof;
	private String variantProof;
	private List<String> questionsProof = new ArrayList<>();
	
	
	
	public ProofResponseFindAllDTO(Proof entity) {
		this.id = entity.getId();
		this.nameProof = entity.getNameProof();
		this.variantProof = entity.getVariantProof();
		this.questionsProof = entity.getQuestionsProof();
	}
	
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
