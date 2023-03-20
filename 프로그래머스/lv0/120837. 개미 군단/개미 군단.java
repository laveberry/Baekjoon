class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] arr = {5, 3, 1};
        
        for(int i=0 ; i<arr.length ; i++){
            if(hp != 0){
                answer += hp/arr[i];
                hp = hp%arr[i];
            }
        }
        return answer;
    }
}