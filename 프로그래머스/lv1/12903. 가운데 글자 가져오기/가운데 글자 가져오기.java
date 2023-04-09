class Solution {
    public String solution(String s) {
//         int len = s.length()/2;
//         StringBuilder sb = new StringBuilder();
        
//         if(s.length()%2==0){//짝수
//             sb.append(s.charAt(len-1)).append(s.charAt(len));
//         }else{//홀수
//             sb.append(s.charAt(len));
//         }
        
//         return sb.toString();
        
        return s.substring((s.length()-1)/2, s.length()/2 + 1);

        //return s != null ? s.substring((s.length()-1)/2,(s.length()+2)/2) : "";

    }
}