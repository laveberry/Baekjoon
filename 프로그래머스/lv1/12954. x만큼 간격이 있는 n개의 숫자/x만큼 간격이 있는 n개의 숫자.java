class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0 ; i<Math.abs(n) ; i++){
            answer[i] = i==0 ? x : answer[i-1]+x;
        }
        
        return answer;
    }
}