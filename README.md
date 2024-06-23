# **Projeto Final**

## Introdução

Este projeto foi desenvolvido como parte da disciplina de Backend ministrada pelo Professor Ramon Venson na SATC em 2024. Ele visa demonstrar o desenvolvimento de uma aplicação backend utilizando Spring Boot para calcular a emissão de poluentes de veículos com base nos quilômetros rodados.

### 📓 Pré-Requisitos
- Java 21 ou superior
- MongoDB
- Maven
- IDE Java (como IntelliJ IDEA, Eclipse, etc.)

### Estrutura do Projeto

O projeto foi construido conforme a estrutura a seguir:

- **Controllers**
    - CalcController
    - GlobalExceptionHandler
    - HelpController
    - VeiculoController

- **Modelos**
    - ApiHelp
    - ModelVeiculo

- **Repositório**
    - VeiculoRepository

- **Serviço**
    - CalcService
    - VeiculoService


- **Validações**
    - CalcValidation
    - DemoApplication

- **Testes**
    - CalcControllerTest


### Explicação Projeto

- **CalcService**

Encapsula a lógica para calcular a emissão de poluentes com base nos quilômetros rodados de um veículo específico, utilizando dados armazenados no VeiculoRepository da aplicação Spring.

- **VeiculoService**

Centraliza operações de acesso aos dados de veículos, fornecendo métodos para consultar, salvar e excluir veículos. Utiliza o VeiculoRepository para interagir com o banco de dados, seguindo o padrão Service.

- **VeiculoRepository**

Interface do Spring Data MongoDB que oferece métodos padrão para operações CRUD relacionadas à entidade ModelVeiculo. Anotada com @Repository para simplificar a persistência de dados no MongoDB.

- **ModelVeiculo**

A classe ModelVeiculo serve como um modelo de dados para veículos, especificando atributos como tipo de veículo, tipo de combustível e consumo por litro. Utiliza anotações de validação para garantir a integridade dos dados e é mapeada diretamente para documentos MongoDB através das anotações do Spring Data. Essa estrutura facilita a persistência e manipulação de dados de veículos dentro de uma aplicação Spring Boot com MongoDB.

- **ApiHelp**

A classe ApiHelp encapsula informações essenciais para documentar endpoints de uma API, facilitando a compreensão e uso por parte dos desenvolvedores. Ela fornece uma estrutura simples e eficaz para organizar e disponibilizar informações sobre cada endpoint, contribuindo para uma documentação clara e consistente do sistema.

- **CalcController**

O CalcController é um controlador REST do Spring que gerencia requisições relacionadas ao cálculo de emissão de poluentes de veículos. Ele utiliza injeção de dependência para acessar o serviço CalcService, onde a lógica de negócio está encapsulada. O endpoint @PostMapping("/{id}") recebe requisições POST para calcular a emissão com base no ID do veículo e nos dados de validação contidos em CalcValidation. A anotação @Valid assegura que os dados são validados conforme as regras definidas, garantindo a integridade dos cálculos realizados.

- **HelpController**

O HelpController é responsável por fornecer documentação dinâmica dos endpoints da API relacionados à emissão de poluentes de veículos. Ele utiliza a classe ApiHelp para estruturar e disponibilizar informações claras sobre cada endpoint, o que facilita o entendimento e o uso correto da API pelos desenvolvedores. Esse padrão de documentação automática ajuda a manter a consistência e a precisão na documentação da API ao longo do tempo.

- **VeiculoController**

O VeiculoController implementa as operações CRUD para a entidade ModelVeiculo, permitindo que clientes da API realizem operações de listagem, consulta, inserção, atualização e exclusão de veículos poluentes. Ele utiliza injeção de dependência para acessar o VeiculoService, onde está encapsulada a lógica de negócio. As anotações do Spring MVC facilitam o mapeamento correto dos endpoints HTTP, seguindo as práticas recomendadas para construção de APIs RESTful no Spring Framework.

- **GlobalExceptionHandler**

O GlobalExceptionHandler é um componente crucial em aplicações Spring Boot que trata globalmente exceções do tipo MethodArgumentNotValidException, que ocorrem quando a validação de dados falha em endpoints que utilizam validação por anotações como @Valid. Ele captura essas exceções, extrai os erros de validação e os retorna como um mapa JSON, permitindo uma resposta consistente e padronizada para erros de validação em toda a aplicação.

- **CalcControllerTest**

Este teste verifica se o CalcController responde corretamente a uma requisição POST para calcular a emissão de poluentes de um veículo, utilizando o MockMvc para simular a requisição HTTP e o Mockito para mockar o serviço (CalcService). Ele garante que o endpoint esteja configurado corretamente para receber dados JSON e que a lógica de negócio (calcularEmissao) seja chamada com os parâmetros adequados. Isso ajuda a assegurar o comportamento esperado da API sem depender de um servidor em execução.

### Explicação das Rotas

Retorna uma lista de objetos JSON contendo os detalhes de cada veículo.
```
GET /api/emissao/veiculo/{id}
```

Cadastra um novo veículo poluente no sistema.
```
POST /api/emissao/veiculo/{id}
```

Calcula a emissão de poluentes com base nos quilômetros rodados por um veículo específico.
```
POST /api/emissao/calc/veiculo/{id}
```

Atualiza os detalhes de um veículo poluente existente.
```
PUT /api/emissao/veiculo/{id}
```

Deleta um veículo poluente específico com base no ID fornecedido.
```
DELETE /api/emissao/veiculo/{id}
```

Retorna uma lista de informações detalhadas sobre os endpoints disponíveis facilitando a compreensão da aplicação.
```
GET /api/emissao/help
```


