package com.backend_final.demo.service;

import com.backend_final.demo.models.ModelVeiculo;
import com.backend_final.demo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    public double calcularEmissao(String id, double kmRodados) {
        ModelVeiculo veiculo = veiculoRepository.findById(id).orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
        return kmRodados * veiculo.getPpLitro();
    }
}

