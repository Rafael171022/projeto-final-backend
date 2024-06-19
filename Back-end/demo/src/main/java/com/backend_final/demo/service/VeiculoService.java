package com.backend_final.demo.service;

import com.backend_final.demo.models.ModelVeiculo;
import com.backend_final.demo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<ModelVeiculo> findAll() {
        return veiculoRepository.findAll();
    }

    public Optional<ModelVeiculo> findById(String id) {
        return veiculoRepository.findById(id);
    }

    public ModelVeiculo save(ModelVeiculo modelVeiculo) {
        return veiculoRepository.save(modelVeiculo);
    }

    public void deleteById(String id) {
        veiculoRepository.deleteById(id);
    }
}
