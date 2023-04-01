import java.util.*;

class Solution {
    public long solution(long n) {
        
        String[] n_list = String.valueOf(n).split("");
        String str = "";
        
        Arrays.sort(n_list, Collections.reverseOrder());
        
        for(String a : n_list) str += a;
        
        return Long.parseLong(str);
    }
}