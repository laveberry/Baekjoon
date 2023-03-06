import java.util.*;

class Solution {
    public String solution(String s) {

        //a~z
        char[] ca = new char[26];
        //아스키코드로 배열담기
        for(int i=0 ; i<s.length() ; i++){
                ca[s.charAt(i)-97]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ; i<ca.length ; i++){
            if(ca[i]==1) sb.append((char)(i+97));
        }
        
        return sb.toString();
    }
}