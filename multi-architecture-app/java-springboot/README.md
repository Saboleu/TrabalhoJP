# Java Spring Boot Service

## Visão Geral
Esta implementação demonstra os princípios de Clean Architecture, SOLID e separação em camadas (Controller, Service, Repository, Model) utilizando Spring Boot.

## Pré-requisitos
- Java 17+
- Maven 3.8+

## Executando a aplicação
1. Instale as dependências e execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```
2. Acesse a rota de exemplo:
   ```
   GET http://localhost:8080/hello
   ```

## Executando testes
```bash
mvn test
```

## Estrutura
- `controller` expõe os endpoints REST.
- `service` orquestra as regras de negócio.
- `repository` fornece dados para o serviço.
- `model` contém modelos imutáveis para troca de dados.
