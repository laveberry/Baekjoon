import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = sizes[0][0];
        int max2 = sizes[0][1];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0 ; i<sizes.length ; i++){
            max = Math.max(max, sizes[i][0]);
            max2 = Math.max(max2, sizes[i][1]);
            list.add(Math.min(sizes[i][0], sizes[i][1]));
        }
        
        max = Math.max(max, max2);
        
        Collections.sort(list);
        
        answer = max * list.get(sizes.length-1);
        
        return answer;
    }
}