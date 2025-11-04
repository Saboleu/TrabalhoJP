# Multi Architecture App

Conjunto de serviços equivalentes implementados com Java/Spring Boot, Python/FastAPI e Node.js/Express, demonstrando princípios de Clean Architecture, SOLID e separação em camadas (Controller, Service, Repository, Model).

## Estrutura
- `java-springboot`: aplicação Spring Boot com endpoint `/hello`.
- `python-fastapi`: serviço FastAPI com rota `/hello/`.
- `node-express`: servidor Express expondo `/hello`.

Cada serviço possui:
- Camadas separadas (`controller`, `service`, `repository`, `model`).
- Testes unitários (JUnit, pytest e Jest).
- README específico com instruções para instalação, execução e testes.

## Executando os projetos
Consulte os README individuais para detalhes completos. Resumo:

| Stack            | Entrar na pasta | Instalar dependências           | Rodar aplicação                    | Rodar testes |
|------------------|-----------------|----------------------------------|------------------------------------|--------------|
| Java Spring Boot | `java-springboot` | `mvn dependency:go-offline` (opcional) | `mvn spring-boot:run`               | `mvn test`   |
| Python FastAPI   | `python-fastapi` | `pip install -r requirements.txt` | `uvicorn app.main:app --reload`     | `pytest`     |
| Node.js Express  | `node-express`   | `npm install`                     | `npm start`                         | `npm test`   |
