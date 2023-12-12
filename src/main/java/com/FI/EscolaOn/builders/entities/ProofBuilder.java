package com.FI.EscolaOn.builders.entities;

import java.util.List;

import com.FI.EscolaOn.entity.Proof;

public class ProofBuilder {
	private Proof entity;

	private ProofBuilder() {
		this.entity = new Proof();
	}
	
	public static ProofBuilder builder() {
		return new ProofBuilder();
	}
	
	public Proof build() {
		return this.entity;
	}
	
	public ProofBuilder nameProof(String nameProof) {
		this.entity.setNameProof(nameProof);
		return this;
	}
	
	public ProofBuilder variantProof(String variantProof) {
		this.entity.setVariantProof(variantProof);
		return this;
	}
	
	public ProofBuilder questionsProof(List<String> questionsProof) {
		this.entity.setQuestionsProof(questionsProof);
		return this;
	}
}
