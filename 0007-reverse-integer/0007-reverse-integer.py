class Solution:
    def reverse(self, x: int) -> int:
        # 주어진 정수 x를 뒤집은 후 32비트 범위까지 알아보는 문제
        if x < 0:
            sign = -1
            x *= -1
        else:
            sign = 1

        rev = 0
        while x > 0:
            rev = (rev * 10) + (x % 10)
            x //= 10

        result = sign * rev
        if result < -2**31 or result > 2**31 - 1:
            return 0
        else:
            return result
        