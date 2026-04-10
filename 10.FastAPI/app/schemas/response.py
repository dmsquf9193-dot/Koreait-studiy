from pydantic import BaseModel


class inferenceResponse(BaseModel):
    label: str
    score: float