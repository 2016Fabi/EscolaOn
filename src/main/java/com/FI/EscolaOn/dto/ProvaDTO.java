package com.FI.EscolaOn.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ProvaDTO {
	private Long id;
	private String nomeProva;
	private String varianteProva;
	private List<String> perguntasProva = new ArrayList<String>();
	private List<Long> curso;
}
