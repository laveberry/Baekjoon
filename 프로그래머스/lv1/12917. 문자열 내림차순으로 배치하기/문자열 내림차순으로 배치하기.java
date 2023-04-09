import java.util.*;
//import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        //char[] arr = s.toCharArray();
        String[] arr = s.split("");
        
        //Arrays.sort(arr);
        Arrays.sort(arr,  Collections.reverseOrder());

        for(String a : arr){
            answer += a;
        }
        
        return answer;
    }
}