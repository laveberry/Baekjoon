import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String com : completion){
            map.put(com, map.getOrDefault(com, 0)+1);
        }
        for(String com : participant){
            map.put(com, map.getOrDefault(com, 0)-1);
        }
        
        //key, value 다 가져올땐 keySet()보다 entrySet() 사용
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()!=0) return entry.getKey();
        }
        
        return answer;
    }
}