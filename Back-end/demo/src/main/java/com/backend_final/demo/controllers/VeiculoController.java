package com.backend_final.demo.controllers;

import com.backend_final.demo.models.ModelVeiculo;
import com.backend_final.demo.repository.VeiculoRepository;
import com.backend_final.demo.service.VeiculoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/emissao")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;
    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping("/veiculo")
    public List<ModelVeiculo> findAll() {
        return veiculoService.findAll();
    }

    @GetMapping("/veiculo/{id}")
    public Optional<ModelVeiculo> findById(@Valid @PathVariable String id) {
        return veiculoService.findById(id);
    }

    @PostMapping("/veiculo")
    public ModelVeiculo save(@Valid @RequestBody ModelVeiculo modelVeiculo) {
        return veiculoService.save(modelVeiculo);
    }

    @PutMapping("/veiculo/{id}")
    public ModelVeiculo update(@PathVariable String id, @Valid @RequestBody ModelVeiculo modelVeiculo) {
        modelVeiculo.setId(id);
        return veiculoService.save(modelVeiculo);
    }


    @DeleteMapping("/veiculo/{id}")
    public String deleteById(@PathVariable String id) {
        Optional<ModelVeiculo> veiculo = veiculoRepository.findById(id);
        if (veiculo.isPresent()) {
            veiculoRepository.deleteById(id);
            return "Veiculo deletado";
        } else {
            return "Veiculo não encontrado";
        }
    }

}
