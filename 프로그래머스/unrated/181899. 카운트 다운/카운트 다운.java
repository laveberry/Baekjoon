import java.util.stream.IntStream;
import java.util.*;


class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        // answer = IntStream.rangeClosed(end, start).toArray();
        //이거 사용은 Integer[]만
        // Arrays.sort(answer, Collections.reverseOrder());
        
        for(int i=0 ; i<=start-end ; i++){
            answer[i] = start-i;
        }
        
        return answer;
    }
}