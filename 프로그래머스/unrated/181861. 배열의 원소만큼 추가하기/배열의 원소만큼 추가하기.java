import java.util.stream.*;
import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).flatMap(x -> IntStream.range(0, x).map(i -> x)).toArray();
    }
}