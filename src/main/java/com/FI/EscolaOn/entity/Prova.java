package com.FI.EscolaOn.entity;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_Prova")
public class Prova {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String nomeProva;
	private String varianteProva;
	private List<String> perguntasProva;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "TB_PROVA_PROFESSOR", joinColumns = {
			@JoinColumn(name = "prova_id", referencedColumnName = "id")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "professor_id",referencedColumnName = "id")
	}
	)
	@JsonIgnore
	private List<Professor> professor;
}
