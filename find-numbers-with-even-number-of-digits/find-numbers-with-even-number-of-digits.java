class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        //여기서 int num : nums 를 해석하면 nums 배열의 각 요소를 하나씩 가져와서 'num'이라는 변수에 대입한다는 것
        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
  
    private int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
