class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a==b) answer = a;
        else{
            int c = a>b ? b : a;
            int d = a>b ? a : b;
            for(int i=c; i<=d ; i++){
                answer += i;
            }
        }
        
        return answer;
    }
}