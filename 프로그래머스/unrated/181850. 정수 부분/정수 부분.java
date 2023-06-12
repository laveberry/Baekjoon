class Solution {
    public int solution(double flo) {
        int answer = 0;
        //split() 파라미터를 정규식받아 .는 마침표로 인식 그냥 .는 안됨. \\. 나 [.] 사용
        String[] str = String.valueOf(flo).split("[.]");
        return Integer.parseInt(str[0]);
    }
}