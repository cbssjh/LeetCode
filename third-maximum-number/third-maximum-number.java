class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); //일단 오름차순 정렬 먼저

        // 중복값 제거 과정
        int prev = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i]) {
                continue;
            }
            prev = nums[i];
            nums[index++] = nums[i]; 
        }
        // 배열의 크기가 3보다 작으면 3번째로 큰 값이 없는 건데, 그럴 경우 문제에서 2번째로 큰 값을 원했으니
        if (index < 3) {
            return nums[index-1];
        }
        // 중복값이 제거된 배열에서 뒤에서 3번째가 큰 값
        return nums[index-3];
    }
}