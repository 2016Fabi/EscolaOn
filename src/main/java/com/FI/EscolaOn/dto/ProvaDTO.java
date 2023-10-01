package com.FI.EscolaOn.dto;

import java.util.List;
import java.util.UUID;

import com.FI.EscolaOn.entity.Professor;

import lombok.Data;
@Data

public class ProvaDTO {
	private UUID id;
	private String nomeProva;
	private String varianteProva;
	private String perguntasProva;
	
	private List<Professor> professor;
}
