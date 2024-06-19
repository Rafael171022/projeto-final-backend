package com.api;

import com.backend_final.demo.controllers.CalcController;
import com.backend_final.demo.service.CalcService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class) //Aqui ele halibilita o uso do Mockito com JUnit 5
public class CalcControllerTest {

    @InjectMocks
    CalcController controller; //Cria uma instância do controlador a ser testado

    @Mock
    private CalcService service; //Cria um Mock do serviço utilizado pelo controller

    private MockMvc mockMvc; //Cria um objeto para simular requisições HTTP

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void testCalcularEmissao() throws Exception {
        // Dados de exemplo
        String veiculoId = "123";
        double kmRodados = 1000.0;
        String requestBody = "{\"kmRodados\": " + kmRodados + "}";

        //Mock do serviço (opcional, dependendo do teste)
        when(service.calcularEmissao(any(String.class), any(Double.class))).thenReturn(1000.0);

        // Executa a requisição POST mockada
        mockMvc.perform(post("/api/emissao/calc/veiculo/{id}", veiculoId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk()); //Verifica se o Status da resposta é OK (200).

        // Por fim verifica se o serviço foi chamado com os parâmetros esperados
        verify(service).calcularEmissao(veiculoId, kmRodados);
    }
}
