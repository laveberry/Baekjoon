import java.util.*;

class Solution {
    public int[] solution(String s) {
        s=s.replaceAll("[{}]"," ").trim();
        String[] str = s.split(" , ");
        
        int[] answer = new int[str.length];
        Set<String> set = new HashSet<>();
        //정렬
        Arrays.sort(str, (a,b) -> (a.length() - b.length()));
        
        for(int i=0 ; i<str.length ; i++){
            String[] a = str[i].split(",");
            for(int k=0; k<a.length ; k++){
                if(set.add(a[k])) answer[i] = Integer.parseInt(a[k]);
            }
        }
        
        return answer;
    }
}