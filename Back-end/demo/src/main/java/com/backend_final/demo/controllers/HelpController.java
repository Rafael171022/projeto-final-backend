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
                        "/api/emissao/calc/veiculo",
                        "POST",
                        "Calcula as emissões de carbono com base no km que o carro ira percorrer.",
                        Arrays.asList("km: double")
                ),
                new ApiHelp(
                        "/api/emissao/veiculo",
                        "GET",
                        "Traz todos os veiculos poluentes cadatrados ",
                        Arrays.asList("All")
                ),
                new ApiHelp(
                        "/api/emissao/veiculo/{id}",
                        "GET",
                        "Traz todos os veiculos poluentes cadatrados ",
                        Arrays.asList("Passar id na Url")
                ),
                new ApiHelp(
                        "/api/emissao/veiculo",
                        "POST",
                        "Cadastrar um veiculo poluidor",
                        Arrays.asList("tipoCombustivel: String","tipoVeiculo: String","ppLitro: double =  1 litro de gasolina = 1 x 0,82 x 0,75 x 3,7 = 2,2755 total de kg CO2 emitido por litro")
                ),
                new ApiHelp(
                        "/api/emissao/veiculo/{id}",
                        "PUT",
                        "Atualizar um veiculo poluidor pelo id",
                        Arrays.asList("tipoCombustivel: String","tipoVeiculo: String","ppLitro: double")
                ),
                new ApiHelp(
                        "/api/emissao/veiculo/{id}",
                        "DELETE",
                        "Deleta um veiculo poluidor pelo id",
                        Arrays.asList("Passar id na Url")
                )
        );
    }
}