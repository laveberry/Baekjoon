class Solution {
    public int solution(int n) {
        int cnt = 0;
        String tj = Integer.toBinaryString(n);
        
        for(int i=0 ; i<tj.length() ; i++){
            char t = tj.charAt(i);
            if(t=='1') cnt++;
        }
        
        int num = n+1;
        int cnt2 = 0;
        
        while(true){ //무한루프
            String a = Integer.toBinaryString(num);
            for(int i=0 ; i<a.length() ; i++){
                char t = a.charAt(i);
                if(cnt2>cnt) break;
                if(t=='1') cnt2++;
            }
            
            if(cnt2==cnt){
                return num;
            }else{
                num++;
                cnt2=0;
            }
        }
    }
}