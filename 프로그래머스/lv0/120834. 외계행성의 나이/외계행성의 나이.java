class Solution {
    public String solution(int age) {
        String answer = "";
        
        //char, String 두가지 버전
        
        //String[] list = String.valueOf(age).split("");
        char[] list = String.valueOf(age).toCharArray();
        
        //for(String a : list){
        for(char a : list){
            //int b = Integer.parseInt(a)+'a';
            int b = a+'1';
            answer += (char)b;
        }
        
        return answer;
    }
}