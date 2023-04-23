class Solution {
    public String solution(String s) {
        String answer = "";
        String[] reset = s.split(" ", -1);
        
        for(String re : reset){
            for(int i=0 ; i<re.length() ; i++){
                String str = re.substring(i, i+1);
                if(i%2==0) answer+= str.toUpperCase();
                else answer+= str.toLowerCase();
            }
            answer += " ";
        }
        
        answer = answer.substring(0, answer.length()-1);
        
        return answer;
    }
}