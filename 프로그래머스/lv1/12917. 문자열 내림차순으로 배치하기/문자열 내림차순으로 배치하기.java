import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        for(int i=0 ; i<arr.length ; i++){
            answer+= arr[arr.length-i-1];
        }
        
        return answer;
    }
}