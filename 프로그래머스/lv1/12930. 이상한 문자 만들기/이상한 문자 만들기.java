class Solution {
    public String solution(String s) {
        String answer = "";
        String[] reset = s.split("");
        int i = 0;
        
        for(String re : reset){
            if(re.equals(" ")) {
                i = 0;
                answer+= re;
                continue;
            }
            if(i%2==0) answer+= re.toUpperCase();
            else answer+= re.toLowerCase();
            
            i++;
        }
                
        return answer;
    }
}