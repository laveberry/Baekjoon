import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> sum = new ArrayList<>();
        for(int i=0 ; i<score.length ; i++){
            sum.add(score[i][0] + score[i][1]);
        }
        //리스트 내림차순 정렬
        sum.sort(Comparator.reverseOrder());
        
        int[] answer = new int[score.length];
        
        for(int i=0 ; i<score.length ; i++){
            answer[i] = sum.indexOf(score[i][0] + score[i][1])+1;
        }
            
        return answer;
    }
}