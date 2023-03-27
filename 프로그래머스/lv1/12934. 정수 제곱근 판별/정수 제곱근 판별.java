class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double test = Math.sqrt(n);
        long sq = (long)test;
        
        if(test%1==0) answer = (sq+1)*(sq+1);
        else answer = -1;
        
        return answer;
    }
}