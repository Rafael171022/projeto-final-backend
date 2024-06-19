package com.backend_final.demo.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "poluicaoVeiculo")
public class ModelVeiculo {
    @Id
    private String id;

    @NotNull(message = "O nome não pode ser vazio ou nulo")
    @Size(min = 5, max = 100, message = "Tipo do veiculo precisa ter entre 5 e 100 caracteres")
    private String TipoVeiculo;

    @NotNull(message = "O nome não pode ser vazio ou nulo")
    @Size(min = 5, max = 100, message = "Tipo do veiculo precisa ter entre 5 e 100 caracteres")
    private String TipoCombustivel;

    @Min(value = 0, message = "Informe um valor maior que zeros")
    @Max(value = 1000, message = "Informe um valor menor que 1000")
    private Double PpLitro;

    public String getId(String id) {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }

    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        TipoCombustivel = tipoCombustivel;
    }

    public Double getPpLitro() {
        return PpLitro;
    }

    public void setPpLitro(Double ppLitro) {
        PpLitro = ppLitro;
    }


}
