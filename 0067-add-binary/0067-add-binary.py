class Solution:
    def addBinary(self, a: str, b: str) -> str:
        # Binary string인 a, b 둘다 10진수로 변환 후 더해줌
        a = int(a, 2)
        b = int(b, 2)
        # 더했던 값을 다시 binary string으로 바꾸고 2번째 문자까지 잘라서 반환
        return bin(a + b)[2:]
        