class Solution {
    public boolean validMountainArray(int[] arr) {
        // length가 3 이상일 경우만 mountaun array가 성립될 수 있다.
        if (arr.length < 3){
            return false;
        }
        
        int top = 0; //배열 중 top(꼭대기)값을 저장하기 위한 변수
        
        for (int i = 0; i < arr.length - 1; i++ ){
            // 0번째 index 값은 1번째보다 항상 작아야한다.
            if (arr[0] > arr[1]){
                return false;
            }
            // 이웃된 index값이 같아지게되면 평지가 생긴 것이라서 성립하지 않는다.
            if (arr[i] == arr[i+1]){
                return false;
            }
            // top을 알아보기위한 조건.
            if (arr[i] > arr[i+1] && top == 0){
                top = arr[i];
                
            }else if (top > 0){ // top이 찍히고 M.A가 성립하려면 내림차순이어야 한다.
                if(arr[i] < arr[i+1]){
                    return false;
                }
            }
            
        }
        // 마지막까지 top이 찍히지 않는다면 M.A가 아니라서 false를 반환한다.
        if (top == 0){
            return false;
        }
        return true;
        
    }
}