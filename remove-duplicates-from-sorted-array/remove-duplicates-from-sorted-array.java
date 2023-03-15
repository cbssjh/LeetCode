class Solution {
    //주어진 정렬된 배열에서 중복을 제거하여 배열(길이) 를 리턴하는 문제입니다.
    public int removeDuplicates(int[] nums) {
        //배열의 길이가 0일때의 예외처리
        if(nums.length == 0){
            return 0;
        }
        int result = 1;
        
        for(int i=1 ; i<nums.length ; i++){
            //요소가 중복값이 아닐 때에만 가져오고 리턴할 배열의 길이를 늘려줌
            if(nums[i]!=nums[i-1]){
                nums[result]=nums[i];
                result++;
            }
        }
        return result;
    }
}
