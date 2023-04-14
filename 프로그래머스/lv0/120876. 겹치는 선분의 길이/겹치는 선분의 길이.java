import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i<lines.length ; i++){
            for(int j=lines[i][0] ; j<lines[i][1] ; j++){
                int a = map.getOrDefault(j, 0);
                map.put(j, ++a);
            }
        }
        
        for (Integer value : map.values()) {
            if (value > 1) answer++;
        }
        
        
        return answer;
    }
}