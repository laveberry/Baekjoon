import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int cnt = 1;
        Set<Integer> set = new HashSet<>();
        int temp = 0;
        
        //길이만큼 반복
        for(int i=0 ; i<elements.length ; i++){
            for(int k=0 ; k<elements.length ; k++){
                temp = 0;
                //cnt개수 만큼만 더해야함
                for(int n=k ; n<k+cnt ; n++){
                    temp+= elements[n%elements.length];
                }
                set.add(temp);
            }
            cnt++;
        }        
        return set.size();
    }
    
}