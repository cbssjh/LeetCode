class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        
        int i = 0;
        int j = 1;
        while(i < j && j < nums.length){
            if(nums[i] == 0 && nums[j] == 0){
                i--;
            }else if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
            j++;
        }
    }
}