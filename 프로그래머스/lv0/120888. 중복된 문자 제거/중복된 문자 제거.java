class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(String a : my_string.split("")){
            if(!answer.contains(a)){
                answer += a;
            }
        }

        return answer;
    }
}