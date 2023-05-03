import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();
        
        for(String str : keymap){
            String[] s = str.split("");
            for(String a : s){
                if(map.containsKey(a)){//키존재시
                    if(str.indexOf(a)<map.get(a)){
                        map.put(a , str.indexOf(a)+1);
                    }
                }else{
                    map.put(a , str.indexOf(a)+1);
                }
            }
        }
        
        int num = 0;
    
        for(String str : targets){
            String[] s = str.split("");
            int cnt = 0;
            boolean flag = true;
            for(String a : s){
                if(!map.containsKey(a)){//키존재하지않을때
                    answer[num] = -1;
                    //cnt = -1;
                    flag = false;
                }else{
                    cnt+=map.get(a);
                }
            }
            if(flag==true) answer[num] = cnt;
            num++;
        }
        
        return answer;
    }
}