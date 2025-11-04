from app.models.greeting import GreetingResponse
from app.repositories.greeting_repository import GreetingRepository


class GreetingService:
    """Aplica regras de negócio sobre os dados do repositório."""

    def __init__(self, repository: GreetingRepository | None = None) -> None:
        self.repository = repository or GreetingRepository()

    def get_greeting(self) -> GreetingResponse:
        message = self.repository.get_greeting()
        return GreetingResponse(message=message)
