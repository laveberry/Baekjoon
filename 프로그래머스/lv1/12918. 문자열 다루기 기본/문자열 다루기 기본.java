class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4 || s.length()==6){
            for(char a : s.toCharArray()){
                if(!(a>='0'&&a<='9')) return false;
            }
        }else{
            answer = false;
        }
        
        return answer;
    }
}