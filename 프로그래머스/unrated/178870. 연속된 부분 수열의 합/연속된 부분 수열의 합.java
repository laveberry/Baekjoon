class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sum = 0;
        int cal= sequence.length;
        
        for(int l=0, r=0 ; l<sequence.length ; l++){
            while(r<sequence.length && sum<k){
                sum+=sequence[r++];
            }
            
            if(sum==k && r-1-l<cal){
                cal = r-1-l;
                answer[0] = l;
                answer[1] = r-1;
            }
            
            sum -= sequence[l];
        }
        
        return answer;
    }
}