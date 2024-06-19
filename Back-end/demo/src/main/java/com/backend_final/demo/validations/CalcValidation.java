package com.backend_final.demo.validations;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Valid
public class CalcValidation {
    @NotNull(message = "kmRodados não pode ser nulo")
    @Min(value = 0, message = "kmRodados deve ser maior ou igual a zero")
    private Double kmRodados;

    public Double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Double kmRodados) {
        this.kmRodados = kmRodados;
    }
}

