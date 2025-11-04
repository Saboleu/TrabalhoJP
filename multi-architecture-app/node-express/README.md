# Node.js Express Service

## Visão Geral
Aplicação Express organizada em camadas (Controller, Service, Repository, Model) seguindo princípios SOLID e Clean Architecture.

## Pré-requisitos
- Node.js 18+
- npm 9+

## Executando a aplicação
1. Instale as dependências:
   ```bash
   npm install
   ```
2. Execute o servidor:
   ```bash
   npm start
   ```
3. Acesse a rota de exemplo:
   ```
   GET http://localhost:3000/hello
   ```

## Executando testes
```bash
npm test
```

## Estrutura
- `controllers` define as rotas Express.
- `services` contém a lógica de orquestração.
- `repositories` lida com a obtenção de dados.
- `models` expõe objetos de transferência de dados.
