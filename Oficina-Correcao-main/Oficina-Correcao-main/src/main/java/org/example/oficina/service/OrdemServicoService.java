package org.example.oficina.service;

import org.example.oficina.dto.OrdemServicoRequestDTO;
import org.example.oficina.dto.OrdemServicoResponseDTO;
import org.example.oficina.exception.RecursoNaoEncontradoException;
import org.example.oficina.model.OrdemServico;
import org.example.oficina.model.Veiculo;
import org.example.oficina.repository.OrdemServicoRepository;
import org.example.oficina.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<OrdemServicoResponseDTO> listarTodos() {
        return ordemServicoRepository.findAll()
                .stream()
                .map(this::converterParaResponse)
                .toList();
    }

    public OrdemServicoResponseDTO buscarPorId(Long id) {
        OrdemServico os = ordemServicoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Ordem de serviço não encontrada com id: " + id));

        return converterParaResponse(os);
    }

    public OrdemServicoResponseDTO cadastrar(OrdemServicoRequestDTO dto) {
        Veiculo veiculo = veiculoRepository.findById(dto.veiculoId())
                .orElseThrow(() -> new RecursoNaoEncontradoException("Veículo não encontrado com id: " + dto.veiculoId()));

        OrdemServico os = new OrdemServico();
        os.setDescricaoProblema(dto.descricaoProblema());
        os.setStatus(dto.status());
        os.setValorServico(dto.valorServico());
        os.setVeiculo(veiculo);

        OrdemServico salvo = ordemServicoRepository.save(os);
        return converterParaResponse(salvo);
    }

    public OrdemServicoResponseDTO atualizar(Long id, OrdemServicoRequestDTO dto) {
        OrdemServico os = ordemServicoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Ordem de serviço não encontrada com id: " + id));

        Veiculo veiculo = veiculoRepository.findById(dto.veiculoId())
                .orElseThrow(() -> new RecursoNaoEncontradoException("Veículo não encontrado com id: " + dto.veiculoId()));

        os.setDescricaoProblema(dto.descricaoProblema());
        os.setStatus(dto.status());
        os.setValorServico(dto.valorServico());
        os.setVeiculo(veiculo);

        OrdemServico atualizado = ordemServicoRepository.save(os);
        return converterParaResponse(atualizado);
    }

    public void deletar(Long id) {
        OrdemServico os = ordemServicoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Ordem de serviço não encontrada com id: " + id));

        ordemServicoRepository.delete(os);
    }

    public List<OrdemServicoResponseDTO> listarPorVeiculo(Long idVeiculo) {
        return ordemServicoRepository.findByVeiculoIdVeiculo(idVeiculo)
                .stream()
                .map(this::converterParaResponse)
                .toList();
    }

    private OrdemServicoResponseDTO converterParaResponse(OrdemServico os) {
        return new OrdemServicoResponseDTO(
                os.getIdOrdemServico(),
                os.getDescricaoProblema(),
                os.getStatus(),
                os.getValorServico(),
                os.getVeiculo().getIdVeiculo(),
                os.getVeiculo().getPlaca()
        );
    }
}
