class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = String.valueOf(num);
        String reK = String.valueOf(k);
        
        if(str.contains(reK)){
            answer = str.indexOf(reK)+1;
        }else answer = -1;
        
        
        return answer;
    }
}