class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            if (arr[i] == 0){
                for(int j = n - 2; j >= i + 1; j--){ //오른쪽으로 한칸씩 미는 작업
                    arr[j + 1] = arr[j];
                }
                arr[i + 1] = 0;//그리고 0을 추가하고 
                i++; //곧바로 1을 증가시켜서 다음 요소를 건너뛴다.
            }
        }
        
    }
}