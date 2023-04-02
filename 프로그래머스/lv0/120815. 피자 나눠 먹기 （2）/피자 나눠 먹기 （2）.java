class Solution {
    public int solution(int n) {
        int x = 6;
        
        while(x%n!=0){
            x+=6;
        }
        
        return x/6;
    }
}