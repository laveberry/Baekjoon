import java.util.*;

class Solution {
    public int solution(int[] arr) {
        
        Arrays.sort(arr);
        int answer = 0;
        boolean chk = true;
        int n = 1;
        
        while(chk){
            int max = arr[arr.length-1] * n++;
            boolean bool = true;
            
            for(int i=0 ; i<arr.length-1 ; i++){
                if(max%arr[i] != 0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                answer = max;
                chk=false;
            }
        }
        
        return answer;
    }
}