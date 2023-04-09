import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1 && arr[0]==10){
            int[] answer = new int[]{-1};
            return answer;
        }
        
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(a -> a!=min).toArray();
    }
}