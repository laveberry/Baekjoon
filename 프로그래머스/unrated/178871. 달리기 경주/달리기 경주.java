import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        
        List<String> arr = new ArrayList<String>();
        
        for(String a : answer) arr.add(a);
        
        for(int i=0 ; i<callings.length ; i++){
            int a = arr.indexOf(callings[i]);
            String temp = answer[a-1];
            answer[a-1] = answer[a];
            answer[a] = temp;
            //배열 순서 바꾸기
            Collections.swap(arr, a-1,a);
        }
        
        
        
        
        return answer;
    }
}