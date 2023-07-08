import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int p : progresses) que.add(p);
        
        while(!que.isEmpty()){
            int idx = progresses.length - que.size();
            if(progresses[idx]>=100){
                int cnt = 0;
                for(int i=idx ; i<progresses.length ; i++){
                    if(progresses[i]>=100) {
                        que.poll();
                        cnt++;
                    }
                    else break;
                }
                list.add(cnt);
            }else{
                for(int i=idx ; i<progresses.length ; i++){
                    progresses[i] += speeds[i];
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0 ; i< list.size() ; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}