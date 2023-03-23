class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        max_area = 0
        left = 0 # 왼쪽 끝
        right = n - 1 # 오른쪽 끝
        
        # left와 right가 만날 때까지 반복한다
        while left < right:
            curr_area = min(height[left], height[right]) * (right - left)
            max_area = max(max_area, curr_area)
            
            # left와 right 중 높이가 작은 쪽의 인덱스를 한칸씩 이동한다
            if height[left] < height[right]: 
                left += 1
            else: 
                right -= 1
                
        return max_area