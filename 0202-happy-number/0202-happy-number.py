class Solution:
    def isHappy(self, n: int) -> bool:
        def square_sum(num):
            # 자릿수 제곱의 합을 구하는 함수
            sum = 0
            while num > 0:
                sum += (num % 10) ** 2
                num //= 10
            return sum
        
        p = n
        q = square_sum(n)
        
        # 1이 될때까지, 혹은 p랑 q가 같을때까지 반복
        while q != 1 and p != q:
            p = square_sum(p)
            q = square_sum(square_sum(q))
        return q == 1
        