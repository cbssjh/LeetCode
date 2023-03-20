class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        
        while (left <= right){
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];
            
            //만약 leftSquare가 rightSquare보다 크면, 
            // leftSquare 값을 result 배열에 저장하고 left 포인터를 한 칸 증가시킵니다.
            if (leftsquare > rightsquare){
                result[index] = leftsquare;
                left++;
            } else{
                result[index] = rightsquare;
                right--;
            }
            index--;
        }
        return result;
        
        }
            
   }