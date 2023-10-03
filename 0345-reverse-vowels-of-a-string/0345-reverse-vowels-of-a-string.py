class Solution(object):
    def reverseVowels(self, s):
        v = {'a', 'e', 'i', 'o', 'u'}
        s = list(s)
        left_index = 0
        right_index = len(s) - 1

        while left_index < right_index:
            if s[left_index].lower() not in v:
                left_index += 1
                continue

            if s[right_index].lower() not in v:
                right_index -= 1
                continue

            s[left_index], s[right_index] = s[right_index], s[left_index]
            left_index += 1
            right_index -= 1

        return ''.join(s) # 리스트를 문자열로 다시 변환
        