import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] reStr = my_string.toCharArray();
        
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        
        reStr[num1] = b;
        reStr[num2] = a;

        return String.valueOf(reStr);
    }
}