import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[][] people = {{1, 2, 3, 4, 5},
                          {2, 1, 2, 3, 2, 4, 2, 5},
                          {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        
        int[] score = new int[people.length];

        for(int i=0 ; i<answers.length ; i++){
            for(int k=0 ; k<people.length ; k++){
                if(answers[i] == people[k][i%people[k].length]) {
                    map.put(k+1, map.getOrDefault(k+1,0)+1);
                    score[k]++;
                }
            }
        }
        
        Arrays.sort(score);
        int cnt = 1;
        
        for(int i=score.length-2 ; i>=0 ; i--){
            if(score[score.length-1]==score[i]) cnt++;
        }
        
        int[] answer = new int[cnt];
        cnt = 0;
        for(int key : map.keySet()){
            if(map.get(key) == score[score.length-1]) answer[cnt++] = key;
        }
        
        return answer;
    }
}