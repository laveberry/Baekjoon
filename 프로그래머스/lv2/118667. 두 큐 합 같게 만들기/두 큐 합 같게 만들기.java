import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        long[] sum = new long[4];
        int answer = 0;

        for(int i=0 ; i<queue1.length ; i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            sum[1]+=queue1[i];
            sum[2]+=queue2[i];
            sum[0]+= queue1[i]+queue2[i]; //총합
        }
        
        if(sum[0]%2!=0) return -1;
        
        long target = sum[0]/2;
        while(answer<queue1.length*2+5){
            if(target==sum[1]) return answer;
            if(target<sum[1]){
                sum[1]-=q1.peek();
                sum[2]+=q1.peek();
                q2.add(q1.poll());
            }else{
                sum[2]-=q2.peek();
                sum[1]+=q2.peek();
                q1.add(q2.poll());
            }
            answer++;
        }
        return -1;
    }
}