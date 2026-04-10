from fastapi import APIRouter

from app.schemas.calc_request import CalcRequest
from app.services.calc_service import CalcService


router = APIRouter(prefix="/q2")
service = CalcService()


@router.post("/calc")
def calc(request: CalcRequest):
    return service.calculate(request.a, request.b, request.op)
