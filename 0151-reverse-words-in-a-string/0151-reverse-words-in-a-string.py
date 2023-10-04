class Solution(object):
    def reverseWords(self, s):
        result = []
        word = ''

        for c in s:
            if c == ' ': #만약 c가 공백 문자인 경우
                if len(word) != 0:
                    result.append(word)
                word = ''
            else:
                word += c
   
        if len(word) != 0:
            result.append(word)

        return ' '.join(reversed(result))
        