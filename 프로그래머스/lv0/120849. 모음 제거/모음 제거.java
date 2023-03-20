class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] str = my_string.split("");
        
        for(String a : str){
            answer += chkStr(a);
        }
        
        return answer;
    }
    
    public String chkStr(String str){
        switch(str){
            case "a": case "e": case "i": case "o": case "u":
                return "";
            default: 
                return str;

        }
    }
}