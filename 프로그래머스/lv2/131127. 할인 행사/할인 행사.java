import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0 ; i<want.length ; i++){
            map.put(want[i], number[i]);
        }
        
        int num = 0;
        
        while(num+10<=discount.length){
            int maxNum = num+10;
            boolean inBol = true;
            for(int i=num ; i<maxNum ; i++){
                if(map.get(discount[i])==null || map.get(discount[i])<0){
                    inBol = false;
                    break;
                }else{
                    map.put(discount[i], map.get(discount[i])-1);
                }
            }

            if(inBol){
                for(String key : map.keySet()){
                    if(map.get(key)!=0){
                        inBol = false;
                        break;
                    }
                }
            }
            if(inBol){
                answer++;
            }else{
                for(int i=0 ; i<want.length ; i++){
                    map.put(want[i], number[i]);
                }
                num++;
            }
        }
        
        return answer;
    }
}