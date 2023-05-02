import java.time.*;

class Solution {
    public String solution(int a, int b) {
        //자바 8 출시 java.time api
        return LocalDate.of(2016,a,b).getDayOfWeek().toString().substring(0,3);
    }
}