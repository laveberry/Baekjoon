import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        Map<Integer, Integer> winMap = new HashMap<>();
        
        for(int win : win_nums) winMap.put(win, 0);
        
        for(int i=0 ; i<lottos.length ; i++){
            if(lottos[i]==0) cnt++;
            if(winMap.containsKey(lottos[i])) winMap.remove(lottos[i]);
        }
        
        int rk = rank(winMap.size());
        answer[1] = rk == 7 ? 6 : rk;
        
        if(cnt>=rk) answer[0] = 1;
        else answer[0] = rk -cnt;
        
        return answer;
    }
    
    public int rank(int num){
        switch(num){
            case 0 : return 1; //전체일치
            case 1 : return 2; //5개일치
            case 2 : return 3; //4개 - 1등
            case 3 : return 4; //3개 - 2등
            case 4 : return 5; //2 - 3등
            case 5 : return 6; //1 - 4등
            default : return 6;
        }
    }
}