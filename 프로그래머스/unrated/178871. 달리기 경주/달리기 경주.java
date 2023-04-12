import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        
        //List<String> arr = new ArrayList<String>();
        Map<String, Integer> arr = new HashMap<>();
        int count = 0;
        
        for(String a : answer) arr.put(a, count++); //arr.add(a);
        
        for(int i=0 ; i<callings.length ; i++){
            //int a = arr.indexOf(callings[i]);
            int a = arr.get(callings[i]);
            String temp = answer[a-1];
            answer[a-1] = answer[a];
            answer[a] = temp;
            arr.put(answer[a-1], a-1);
            arr.put(temp, a);
            //시간초과
            //Collections.swap(arr, a-1,a);
        }

        return answer;
    }
}