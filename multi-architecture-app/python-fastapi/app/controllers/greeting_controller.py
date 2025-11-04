from fastapi import APIRouter, Depends

from app.models.greeting import GreetingResponse
from app.services.greeting_service import GreetingService

router = APIRouter(prefix="/hello", tags=["hello"])


def get_service() -> GreetingService:
    return GreetingService()


@router.get("/", response_model=GreetingResponse)
def read_greeting(service: GreetingService = Depends(get_service)) -> GreetingResponse:
    return service.get_greeting()
