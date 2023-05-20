import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i=1 ; i<=N; i++){
            double nClear = 0;//도달했으나 미클리어
            double stage = 0;//스테이지 도달
            
            for(int k=0 ; k<stages.length ; k++){
                if(stages[k]==i) nClear++; //미클리어
                if(stages[k]>=i) stage++; //도달
            }
            
            if(stage!=0) map.put(i, nClear/stage);
            else map.put(i, nClear);
        }
        
        for(int i=1 ; i<=N; i++){
            double max = -1;
            int idx = -1;
            for(int key : map.keySet()){
                if(max<map.get(key)){
                    max = map.get(key);
                    idx = key;
                }
            }
            answer[i-1] = idx;
            map.remove(idx);
        }
        
        return answer;
    }
}