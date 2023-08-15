class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(String a : control.split("")){
            answer += calNum(a);
        }
        
        return answer;
    }
    
    public int calNum(String a){
        switch(a){
            case "w": return 1;
            case "s": return -1;
            case "d": return 10;
            case "a": return -10;
        }
        return 0;
    }
    
}