import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        Arrays.sort(numlist);
        List<Integer> nums = new ArrayList<>();
        for(int a : numlist) nums.add(a);
        
        nums.sort((a, b) -> Integer.compare(Math.abs(b-n), Math.abs(a-n)));
        Collections.reverse(nums);
        
		return nums.stream().mapToInt(num -> num).toArray();
    }
}