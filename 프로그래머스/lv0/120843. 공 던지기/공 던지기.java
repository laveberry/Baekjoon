class Solution {
    public int solution(int[] numbers, int k) {
        //런타임 에러
        // int a = k*2-1;
        // int b = numbers.length>a ? a-1 : a%numbers.length-1;
        // return numbers[b];
        
        return numbers[2*(k-1)%numbers.length];
    }
}