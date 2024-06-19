package com.backend_final.demo.controllers;

import com.backend_final.demo.models.ApiHelp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/emissao/help")
public class HelpController {

    @GetMapping
    public List<ApiHelp> getApiHelp() {
        return Arrays.asList(
                new ApiHelp(
                        "/api/emissao/total",
                        "POST",
                        "Calcula as emissões de carbono com base em eletricidade, combustível de carro e viagens aéreas.",
                        Arrays.asList("kWh: double", "liters: double", "km: double", "isInternational: boolean")
                ),
                new ApiHelp(
                        "/api/emissao/eletricidade",
                        "POST",
                        "Calcula as emissões de carbono com base no consumo de eletricidade.",
                        Arrays.asList("kWh: double")
                ),  
                new ApiHelp(
                        "/api/emissao/carro",
                        "POST",
                        "Calcula as emissões de carbono com base no consumo de combustível do carro.",
                        Arrays.asList("liters: double")
                ),
                new ApiHelp(
                        "/api/emissao/aviao",
                        "POST",
                        "Calcula as emissões de carbono com base na distância percorrida em voos.",
                        Arrays.asList("km: double", "isInternational: boolean")
                )
        );
    }
}