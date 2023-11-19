package com.FI.EscolaOn.dto;

import jakarta.validation.constraints.NotNull;

public record EnderecoDTOJava(@NotNull String provincia, @NotNull String municipio, @NotNull String bairro,@NotNull String rua) {

}
