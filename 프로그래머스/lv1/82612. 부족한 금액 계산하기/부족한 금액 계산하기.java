class Solution {
    public long solution(int price, int money, int count) {
        long answer = price;
        
        for(int i=2 ; i<=count ; i++){
            answer+=price*i;
        }
        
        answer = money >= answer ? 0 : answer-money;

        return answer;
    }
}