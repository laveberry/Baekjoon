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
        
        for(String key : map.keySet()){
            if(map.get(key)!=0) return key;
        }
        
        return answer;
    }
}