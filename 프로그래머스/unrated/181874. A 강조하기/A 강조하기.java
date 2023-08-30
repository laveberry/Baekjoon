import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        return myString.chars().mapToObj(x -> (char)x)
            .map(x -> {
                if(x=='a') {
                    return 'A';
                } else if(Character.isUpperCase(x) && x != 'A'){
                    return Character.toLowerCase(x);
                }
                return x;
            })
            .map(String::valueOf)
            .collect(Collectors.joining()); //스트림 문자열 결합
    }
}