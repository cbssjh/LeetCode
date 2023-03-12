class Solution {
     public boolean checkIfExist(int[] arr) {
       if (arr == null && arr.length == 0) return false;
         
        //이중 for 문을 통하여 순차적으로 특정 값에 2배를 한 후 해당 결과가 배열안에 있는지 탐색한다.
        for(int i=0; i<arr.length ; i++) {
            for(int j=0; j<arr.length ; j++) {
                if (i != j && arr[j] * 2 == arr[i]) {
                    return true;
                }
            }
        }

        return false;
    }
}