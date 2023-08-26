import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        //홀수
        String odd = Arrays.stream(num_list).filter(num -> num%2!=0).mapToObj(String::valueOf).collect(Collectors.joining());
        //짝수
        String even = Arrays.stream(num_list).filter(num -> num%2==0).mapToObj(String::valueOf).collect(Collectors.joining());
        
        return Integer.valueOf(odd)+Integer.valueOf(even);
    }
}