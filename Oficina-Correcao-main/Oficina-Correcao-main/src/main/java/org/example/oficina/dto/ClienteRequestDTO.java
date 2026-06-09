package org.example.oficina.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ClienteRequestDTO(

        @NotBlank(message = "O nome do cliente é obrigatório")
        String nome,

        @NotBlank(message = "O telefone é obrigatório")
        String telefone,

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "O e-mail deve ter um formato válido")
        String email
) {
}
