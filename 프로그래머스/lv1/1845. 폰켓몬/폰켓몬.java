import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int cnt = nums.length/2; //최대포켓몬수
        
        for(int mon : nums){
            set.add(mon);
        }
        
        answer = cnt<=set.size() ? cnt :  set.size();
        
        return answer;
    }
}