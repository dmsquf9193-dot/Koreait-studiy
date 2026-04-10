class CalcService:
    def calculate(self, a: int, b: int, op: str):
        if op == "+":
            return a + b
        if op == "-":
            return a - b
        if op == "*":
            return a * b
        if op == "/":
            return a / b

