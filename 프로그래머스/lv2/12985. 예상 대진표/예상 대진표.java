class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        for(int i=0 ; i<n/2 ; i++){
            //더 작은숫자가 -1이고 홀수일때 둘이 붙음
            if(min%2!=0 && max-min==1){
                break;
            }
            min = min%2==0 ? min/2 : (min/2)+1;
            max = max%2==0 ? max/2 : (max/2)+1;
            answer++;
        }

        return answer;
    }
}