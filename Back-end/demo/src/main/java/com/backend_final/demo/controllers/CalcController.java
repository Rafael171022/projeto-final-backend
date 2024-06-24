package com.backend_final.demo.controllers;


import com.backend_final.demo.service.CalcService;
import com.backend_final.demo.validations.CalcValidation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emissao/calc/veiculo")
public class CalcController {
    @Autowired
    private CalcService calcService;


    @PostMapping("/{id}")
    public String calcularEmissao(@PathVariable String id, @Valid @RequestBody CalcValidation calcValidation) {
        double emissao = calcService.calcularEmissao(id, calcValidation.getKmRodados());
        return emissao + " total de kg CO2 emitido por litro";
    }

}
