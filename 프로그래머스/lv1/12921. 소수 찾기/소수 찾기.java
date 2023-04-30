class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2 ; i<=n ; i++){
            boolean cnt=true;
            for(int k=2 ; k<=Math.sqrt(i) ; k++){
                if(i!=k && i%k==0) {
                    cnt=false;
                    break;
                }
            }
            if(cnt==true) answer++;
        }
        return answer;
    }
}