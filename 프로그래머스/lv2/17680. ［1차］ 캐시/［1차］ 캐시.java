import java.util.*;

class Solution {
    
    private static int HIT = 1;
    private static int MISS = 5;
    
    public int solution(int cacheSize, String[] cities) {
        
        if(cacheSize==0) return cities.length * MISS;
        
        int answer = 0;
        LinkedList<String> que = new LinkedList<>();
        
        ///캐시크기에 따른 실행시간 측정
        for(int i=0; i<cities.length; i++){
            String s = cities[i].toUpperCase();
            if(que.remove(s)){
                answer+=HIT;
                que.add(s);
            }else{
                if(que.size()>=cacheSize) que.remove(0);
                answer+=MISS; 
                que.add(s);
            }
        }
        
        return answer;
    }
}