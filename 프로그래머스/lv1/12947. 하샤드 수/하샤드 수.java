class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int hasha = 0;
        int n = x;
        
        while(n>0){
            hasha += n%10;
            n /= 10;
        }
        
        answer = x%hasha == 0 ? true : false;
        
        return answer;
    }
}