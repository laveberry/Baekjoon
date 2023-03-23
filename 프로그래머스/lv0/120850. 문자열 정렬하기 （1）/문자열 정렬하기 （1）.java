import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for(int i=0 ; i<my_string.length() ; i++){
            char a = my_string.charAt(i);
            if('0'<=a && a<='9'){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int b = 0;
        
        for(int i=0 ; i<my_string.length() ; i++){
            char a = my_string.charAt(i);
            if('0'<=a && a<='9'){
                answer[b++] = Character.getNumericValue(a);
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}