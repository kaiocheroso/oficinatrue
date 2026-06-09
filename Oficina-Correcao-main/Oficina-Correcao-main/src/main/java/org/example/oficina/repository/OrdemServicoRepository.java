package org.example.oficina.repository;

import org.example.oficina.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {

    List<OrdemServico> findByVeiculoIdVeiculo(Long idVeiculo);
}
