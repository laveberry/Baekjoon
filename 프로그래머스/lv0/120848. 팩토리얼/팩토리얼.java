class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=2 ; i<=10 ; i++){
            answer*=i;
            if(answer==n) return i;
            else if (answer>n) return i-1;
        }
        
        return answer;
    }
}