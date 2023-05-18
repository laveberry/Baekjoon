import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 1;
        int rot = 1;
        Boolean bl = false;
        char temp = words[0].charAt(words[0].length()-1);
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0 ; i<words.length; i++){
            Boolean chk = true;
            if(cnt>n) {
                cnt=1;
                rot++;
            }

            if(map.get(words[i])==null){
                map.put(words[i], 1);
            }else chk = false;
            
            if(bl && temp != words[i].charAt(0)) {
                chk = false;
            }
            
            if(!chk){
                answer[0] = cnt;
                answer[1] = rot;
                break;
            }
            bl = true;
            temp = words[i].charAt(words[i].length()-1);
            cnt++;
        }
        
        return answer;
    }
}