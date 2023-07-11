import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //우선순위 큐 내림차순 정렬
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int p : priorities) que.add(p);
        
        while(!que.isEmpty()){
            boolean chk = false;
            for(int i=0; i<priorities.length ; i++){
                if(que.peek()==priorities[i]){
                    que.poll();
                    answer++;
                    if(i==location) return answer;
                }
            }
        }
        
        return answer;
    }
}