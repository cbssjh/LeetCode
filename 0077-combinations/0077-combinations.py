from itertools import combinations
# itertools의 combintations 활용하여 문제 해결

class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        range_list = list(range(1, n+1))
        
        comb_list = list(combinations(range_list, k))
        
        return comb_list
        
        