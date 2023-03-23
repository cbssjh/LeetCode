class Solution:
    def isPalindrome(self, x: int) -> bool:
    # 음수이면 회문(앞으로 읽으나 뒤로 읽으나 동일한 문자열)이 아님
        if x < 0:
            return False
    # 정수를 문자열로 변환하여 비교
        return str(x) == str(x)[::-1]
        