class Solution {
    public int solution(int order) {
         int answer = 0;
        // for(String a : String.valueOf(order).split("")){
        //     if(a.equals("3") || a.equals("6") || a.equals("9")){
        //         answer++;
        //     }
        // }    
        // return answer;
        
        int count = 0;
        while(order != 0){
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) count++;
             order = order/10;
        }
        answer = count;
        return answer;
        
    }
}