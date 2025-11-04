# Python FastAPI Service

## Visão Geral
Implementação em FastAPI com separação em camadas (Controller, Service, Repository, Model) seguindo princípios SOLID e Clean Architecture.

## Pré-requisitos
- Python 3.11+
- `pip` e `virtualenv` opcionais

## Executando a aplicação
1. Crie e ative um ambiente virtual (opcional):
   ```bash
   python -m venv .venv
   source .venv/bin/activate  # Windows PowerShell: .venv\Scripts\Activate.ps1
   ```
2. Instale as dependências:
   ```bash
   pip install -r requirements.txt
   ```
3. Rode o servidor:
   ```bash
   uvicorn app.main:app --reload
   ```
4. Acesse a rota de exemplo:
   ```
   GET http://localhost:8000/hello/
   ```

## Executando testes
```bash
pytest
```

## Estrutura
- `controllers` define os routers FastAPI.
- `services` aplica regras de negócio.
- `repositories` centraliza o acesso a dados.
- `models` agrupa os esquemas Pydantic compartilhados.
