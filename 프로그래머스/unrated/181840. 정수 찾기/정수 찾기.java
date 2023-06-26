import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list, int n) {
        
        // long num = Arrays.stream(num_list).filter(i -> i==n).count();
        // return num > 0 ? 1 : 0;
        
        return IntStream.of(num_list).anyMatch(a -> a == n) ? 1 : 0;
        
    }
}