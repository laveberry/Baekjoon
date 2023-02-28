import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String s : s1){
            if(Arrays.stream(s2).anyMatch(s::equals)){
                answer++;
            }
        }
        
        return answer;
    }
}