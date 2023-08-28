import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length-1];
        int preLast = num_list[num_list.length-2];
        
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        list.add(last > preLast ? last-preLast : last * 2);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}