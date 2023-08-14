class Solution {
    public String[] solution(String my_string) {
        // 한 개 이상의 공백 (\\s+ 정규 표현식)
        return my_string.trim().split("\\s+");
    }
}