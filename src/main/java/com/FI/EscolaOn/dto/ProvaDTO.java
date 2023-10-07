package com.FI.EscolaOn.dto;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class ProvaDTO {
	private UUID id;
	private String nomeProva;
	private String varianteProva;
	private List<String> perguntasProva;	
	private List<UUID> professor;
}
