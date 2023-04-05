class Solution {
    public int solution(int chicken) {
        int answer = chicken/10;
        int temp = chicken%10 + answer;
        
        while(temp>=10){
            answer += temp/10;
            temp = temp/10 + temp%10;
        }
        
        return answer;
    }
}