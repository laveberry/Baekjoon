class Solution {
    public int solution(String my_string) {
        
        String[] reStr = my_string.split(" ");
        int answer = Integer.parseInt(reStr[0]);
        
        for(int i=1 ; i< reStr.length; i+=2){
            int a = Integer.parseInt(reStr[i+1]);
            if(reStr[i].equals("+")){
                answer+=a;
            }else{
                answer-=a;
            }
        }
        
        return answer;
    }
}