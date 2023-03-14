class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int c = 0; // so far, 가장 큰 수를 저장하기 위한 변수
        int d = 0; // 새로운 큰 수를 업데이트 하기 위한 임시 저장 변수
        
        if (arr.length < 1) {//크기가 1인 배열일 경우.
            arr[0] = -1;
            return arr;
        }
        for (int i = len-1; i >= 0; i--){ //중요 포인트, 끝 부분부터 시작하면 비교하기가 쉬워진다.
            if (i == len-1){
                c = arr[i]; // 지금까지의 가장 큰 수인 arr[len-1] 값을 c에 저장한다.
                arr[i] = -1;
            }
            else if (arr[i] > c){ //이 조건이 만족되면 arr[i] 값이 최대값
                d = arr[i]; //잠시 arr[i] 값을 임시 저장변수 d에 저장하고
                arr[i] = c; //arr[i]에 arr[i+1]~arr[len-1] 값 중 가장 큰 수를 저장한 다음에
                c = d; //임시 저장했던 최대 값을 c에 다시 저장한다.
                
            }else if(arr[i] < c){
                arr[i] = c; // arr[i+1]~arr[len-1] 값 중 가장 큰 수 c를 업데이트 해주면 된다.
            }
        }
        return arr;
    }
}