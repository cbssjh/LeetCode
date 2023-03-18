class Solution {
    public int heightChecker(int[] heights) {
        int [] expected = heights.clone();
        Arrays.sort(expected); //오름차순으로 정렬
        
        int check = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                check++;
            }
        }
        return check;
    }
}