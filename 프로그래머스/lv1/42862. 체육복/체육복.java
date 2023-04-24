import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //여벌의 체육복을 가져왔지만 도난당한 학생수
        for(int i=0 ; i<lost.length ; i++){
            for(int j=0 ; j<reserve.length ; j++){
                if(lost[i]==reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = 200;
                    break;
                }
            }
        }
        
        for(int i=0 ; i<lost.length ; i++){
            for(int j=0 ; j<reserve.length ; j++){
                if(Math.abs(lost[i]-reserve[j])==1){
                    answer++;
                    reserve[j] = 100;
                    break;
                }
            }
        }
        
        return answer;
    }
}