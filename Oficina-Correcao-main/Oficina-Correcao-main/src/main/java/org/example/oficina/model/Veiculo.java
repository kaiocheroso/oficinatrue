package org.example.oficina.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeiculo;

    private String placa;

    private String modelo;

    private Integer ano;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "veiculo", cascade = CascadeType.ALL)
    private List<OrdemServico> ordensServico;

    public Veiculo() {}
}
