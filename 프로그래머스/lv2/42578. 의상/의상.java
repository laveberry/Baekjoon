import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] c : clothes){
            //안입는 경우도 고려해 최초값은 1
            map.put(c[1], map.getOrDefault(c[1], 1) +1);
        }
        
        Map<String, Integer> map2 = new HashMap<>();
        
        for(String key : map.keySet()){
            answer*=map.get(key);
        }
        
        //하나도 안입은 경우 최종 빼주기
        return answer-1;
    }
}