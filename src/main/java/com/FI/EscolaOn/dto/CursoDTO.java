package com.FI.EscolaOn.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CursoDTO {
    @NotBlank
    private String curso;
    private int cargaHoraria;
    @NotBlank
    private String descricao;
}
