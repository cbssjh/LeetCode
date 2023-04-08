class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        # 트리 구조 dfs로 해결
        result = []
        def dfs(index, path):
            result.append(path)
            
            for next_index in range(index, len(nums)):
                dfs(next_index + 1, path + [nums[next_index]])
                
        dfs(0, [])
        return result
        