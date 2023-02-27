import java.util.Arrays;

class Solution {
    public int solution(int n) {
         // int answer = 0;
        
//         String[] stn = String.valueOf(n).split("");
        
//         for(int i=0 ; i<stn.length ; i++){
//             answer += Integer.parseInt(stn[i]);
//         }
        
        // return answer;
                
     return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
        
    }
}