class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        #재귀적 백트래킹을 활용
        result = []
        
        def dfs(elements, selected):
            # 남은 요소가 없을 시에 백트래킹
            if not elements:
                result.append(selected)
                return
            for i in range(len(elements)):
                dfs(elements[:i] + elements[i + 1:], selected + [elements[i]])
                
        dfs(nums, [])
        return result
        