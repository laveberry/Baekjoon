class Solution {
    public int solution(int order) {
        int answer = 0;
        for(String a : String.valueOf(order).split("")){
            if(a.equals("3") || a.equals("6") || a.equals("9")){
                answer++;
            }
        }
        
        return answer;
    }
}