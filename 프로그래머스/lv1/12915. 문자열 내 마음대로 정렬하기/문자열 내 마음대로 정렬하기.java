import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Map<String, String> map = new HashMap<>();
        
        for(int i=0 ; i<strings.length ; i++){
            String str = String.valueOf(strings[i].charAt(n));
            answer[i] = str + strings[i];
        }
        
        Arrays.sort(answer);
        
        for(int i=0 ; i<strings.length ; i++){
            answer[i] = answer[i].substring(1, answer[i].length());
        }
        
        return answer;
    }
}