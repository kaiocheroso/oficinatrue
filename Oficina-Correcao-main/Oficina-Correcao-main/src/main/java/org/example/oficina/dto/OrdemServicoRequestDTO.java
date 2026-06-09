package org.example.oficina.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public record OrdemServicoRequestDTO(

        @NotBlank(message = "A descrição do problema é obrigatória")
        String descricaoProblema,

        @NotBlank(message = "O status é obrigatório")
        String status,

        @NotNull(message = "O valor do serviço é obrigatório")
        @PositiveOrZero(message = "O valor do serviço deve ser maior ou igual a zero")
        Double valorServico,

        @NotNull(message = "O id do veículo é obrigatório")
        Long veiculoId
) {
}
