package com.FI.EscolaOn.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_Prova")
public class Prova{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeProva;
	private String varianteProva;
	private List<String> perguntasProva = new ArrayList<String>();
	
	@ManyToMany(mappedBy = "prova")
	private List<Professor> professor;
	
}
