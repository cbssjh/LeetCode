class Solution {
    public void moveZeroes(int[] nums) {
       for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                continue;
            }
            for (int j = i; j < nums.length - 1; j++) {
                swap(nums, j, j + 1);
            }
        }
    }
    
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}