import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        Map<Integer, Integer> arr = new HashMap<>();
        
        for(int i=left ; i<=right ; i++){
            int cnt = 0;
            for(int j=1 ; j<=i; j++){
                if(i%j==0) cnt++;
            }
            if(cnt !=0 ) arr.put(i, cnt);
        }
        
        for(int i=left ; i<=right ; i++){
            answer += arr.get(i)%2==0 ? i : -i;
        }
        
        return answer;
    }
}