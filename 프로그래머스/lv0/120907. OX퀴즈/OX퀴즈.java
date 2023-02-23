class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int result = 0;
        for(int i=0; i< quiz.length ; i++){
            String[] arr = quiz[i].split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            int c = Integer.parseInt(arr[4]);
            
            if(arr[1].equals("+")) result = a+b;
            else result = a-b;
            
            if(c==result)  answer[i] = "O";
            else answer[i] = "X";
            
        }
        return answer;
    }
}