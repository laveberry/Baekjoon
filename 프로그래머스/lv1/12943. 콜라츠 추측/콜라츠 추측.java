class Solution {
    public int solution(int num) {
        int answer = 0;
        long reNum = num; //long으로 세팅해주기
                
        for(int i=0 ; i<500 ; i++){
            if(reNum==1) return i;
            reNum = reNum%2==0 ? reNum/2 : reNum*3+1;
        }
        return -1;
    }
}