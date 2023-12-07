package com.FI.EscolaOn.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proof {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameProof;
	private String variantProof;
	private List<String> questionsProof = new ArrayList<>();

	public Proof() {
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
