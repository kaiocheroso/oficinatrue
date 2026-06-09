package org.example.oficina.dto;

public record ClienteResponseDTO(
        Long idCliente,
        String nome,
        String telefone,
        String email
) {
}
