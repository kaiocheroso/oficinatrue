package org.example.oficina.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

public record VeiculoRequestDTO(

        @NotBlank(message = "A placa é obrigatória")
        String placa,

        @NotBlank(message = "O modelo é obrigatório")
        String modelo,

        @NotNull(message = "O ano é obrigatório")
        @Min(value = 1900, message = "Ano inválido")
        @Max(value = 2100, message = "Ano inválido")
        Integer ano,

        @NotNull(message = "O id do cliente é obrigatório")
        Long clienteId
) {
}
