class Solution:
    def convert(self, s: str, numRows: int) -> str:
        # numRows가 1일 경우 문자열 s 자체 반환
        if numRows == 1: 
            return s
        
        # 리스트 rows를 생성하여 각 행마다의 문자를 저장
        rows =[''] * numRows
        currRow = 0
        direction = -1
        
        # 문자열 c를 순회하면서, 현재 문자를 현재 행에 추가하고,
        # currRow 위치를 업데이트
        for c in s:
            rows[currRow] += c
            # 현재 형이 맨 윗줄이나 맨 아랫줄에 위치한 경우 direction 값을
            # 반환시킨다
            if currRow == 0 or currRow == numRows -1:
                direction *= -1
            currRow += direction
        
        # 'rows'리스트에 저장된 문자열을 순서대로 이어붙인 결과를 반환한다.
        return ''.join(rows)
    
        
        