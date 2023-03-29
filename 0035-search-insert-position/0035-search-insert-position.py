class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums)
        while low < high:
            # '/'하나면 소수점까지 찍히니깐 주의
            mid = low + (high - low)//2    
            if (nums[mid] >= target):
                high = mid
            else: low = mid + 1
        
        return low
        