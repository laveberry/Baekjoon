class Solution {
    public int solution(String num_str) {
        return num_str.chars()  // 스트림용 문자열 분리
                 .map(Character::getNumericValue)  // 각 문자를 해당하는 정수 값으로 변환
                 .sum();
    }
}