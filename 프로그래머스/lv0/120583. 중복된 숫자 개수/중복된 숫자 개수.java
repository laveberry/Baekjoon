import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        // int answer = 0;
        // for(int a : array){
        //     if(a==n) answer++;
        // }
        // return answer;
        
        return (int)Arrays.stream(array).filter(i -> i==n).count();
        
    }
}