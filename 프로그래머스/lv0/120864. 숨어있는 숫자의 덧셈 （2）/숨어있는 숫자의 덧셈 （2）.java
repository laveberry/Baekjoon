
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] ms = my_string.split("[a-zA-Z]");
        
        for(String a : ms){
            if(!a.isEmpty()){
                answer+= Integer.parseInt(a);
            }
        }   
        
        return answer;
        
        // return Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();

    }
}