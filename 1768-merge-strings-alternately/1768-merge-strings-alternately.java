class Solution {
    public String mergeAlternately(String word1, String word2) {
        // string으로 받은 문자열을 char 문자로 쪼갠 뒤에 char[]배열에 순서대로 값을 넣어 반환한다.
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        var length1 = word1.length();
        var length2 = word2.length();
        char [] word = new char[length1 + length2];
        
        int q = 0;
        for (int i = 0; i < length1 || i < length2; i++){
            if (i < length1){
                word[q++] = array1[i];
                
            }
            if (i < length2){
                word[q++] = array2[i];
            }
        }
        return new String(word);
            }
        }