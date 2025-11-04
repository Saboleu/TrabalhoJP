from fastapi import FastAPI

from app.controllers import greeting_controller

app = FastAPI(title="Python FastAPI - Multi Architecture App")

app.include_router(greeting_controller.router)


@app.get("/health", tags=["health"])
def health_check() -> dict[str, str]:
    """Rota simples para verificar se o serviço está saudável."""
    return {"status": "ok"}
