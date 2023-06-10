import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t : tangerine){
            map.put(t , map.getOrDefault(t, 0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet()); 
        //value 기준 내림차순 정렬 공식
        list.sort((a,b) -> map.get(b) - map.get(a));
        
        int i=0;
        while(k>0){
            k-= map.get(list.get(i++));
            answer++;
        }
        
        return answer;
    }
    
}