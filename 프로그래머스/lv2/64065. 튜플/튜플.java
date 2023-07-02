import java.util.*;

class Solution {
    public int[] solution(String s) {
        s=s.replaceAll("[{}]"," ").trim();
        String[] str = s.split(" , ");
        
        int[] answer = new int[str.length];
        Map<String, Integer> map = new HashMap<>();
        //정렬
        Arrays.sort(str, (a,b) -> (a.length() - b.length()));
        
        for(int i=0 ; i<str.length ; i++){
            String[] a = str[i].split(",");
            if(a.length == i+1){
                for(int k=0; k<a.length ; k++){
                    if(map.get(a[k])==null){
                        answer[i] = Integer.parseInt(a[k]);
                        map.put(a[k], 1);
                    }
                }
            }
        }
        
        return answer;
    }
}