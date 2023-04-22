import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=0 ; i<numbers.length ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];

        //return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        
        Iterator<Integer> itr = set.iterator();
        int cnt = 0;
        while(itr.hasNext()){
            answer[cnt++] = itr.next();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}