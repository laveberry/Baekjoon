class Solution {
    public String solution(String s, String skip, int index) {
        char[] words = s.toCharArray();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < index ; j++){
                do{
                    words[i]++;
                    if(words[i] > 'z'){ //범위 초과시 a로 돌아옴
                        words[i] = 'a';
                    }
                }while(skip.contains(String.valueOf(words[i])));
            }
        }
        String answer = String.valueOf(words);
        return answer;
    }
}