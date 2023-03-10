class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1과 nums2의 끝에서부터 비교하여 큰 값을 nums1의 끝에 추가하는 방식으로 작성합니다.
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}