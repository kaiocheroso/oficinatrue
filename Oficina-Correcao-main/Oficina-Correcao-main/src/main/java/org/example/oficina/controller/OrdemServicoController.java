package org.example.oficina.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.example.oficina.dto.OrdemServicoRequestDTO;
import org.example.oficina.dto.OrdemServicoResponseDTO;
import org.example.oficina.service.OrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Ordens de Serviço", description = "Rotas para gerenciamento de ordens de serviço")
@RestController
@RequestMapping("/ordens-servico")
public class OrdemServicoController {

    @Autowired
    private OrdemServicoService service;

    @Operation(summary = "Lista todas as ordens de serviço")
    @GetMapping
    public List<OrdemServicoResponseDTO> listar() {
        return service.listarTodos();
    }

    @Operation(summary = "Busca uma ordem de serviço por id")
    @GetMapping("/{id}")
    public OrdemServicoResponseDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @Operation(summary = "Cadastra uma nova ordem de serviço")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrdemServicoResponseDTO cadastrar(@Valid @RequestBody OrdemServicoRequestDTO dto) {
        return service.cadastrar(dto);
    }

    @Operation(summary = "Atualiza uma ordem de serviço existente")
    @PutMapping("/{id}")
    public OrdemServicoResponseDTO atualizar(@PathVariable Long id, @Valid @RequestBody OrdemServicoRequestDTO dto) {
        return service.atualizar(id, dto);
    }

    @Operation(summary = "Remove uma ordem de serviço")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @Operation(summary = "Lista ordens de serviço de um determinado veículo")
    @GetMapping("/veiculo/{idVeiculo}")
    public List<OrdemServicoResponseDTO> listarPorVeiculo(@PathVariable Long idVeiculo) {
        return service.listarPorVeiculo(idVeiculo);
    }
}
