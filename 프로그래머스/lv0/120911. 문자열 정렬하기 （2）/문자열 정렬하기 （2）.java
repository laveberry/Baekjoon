import java.util.*;

class Solution {
    public String solution(String my_string) {
//         String answer = "";
//         String[] reString = my_string.toLowerCase().split("");
//         //오름차순 정렬
//         Arrays.sort(reString);
//         for(String a : reString){
//             answer+= a;
//         }
//         return answer;
        
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}