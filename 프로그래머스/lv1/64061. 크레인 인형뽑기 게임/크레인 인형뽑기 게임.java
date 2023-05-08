import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0 ; i<moves.length ; i++){
            int temp = 0;
            int a = 0;
            
            for(int k=0 ; k<board.length ; k++){
                if(board[k][moves[i]-1]!=0) {
                    temp = board[k][moves[i]-1];
                    a=k;
                    break;
                }
            }
             
            if(st.size()>0){
                if(temp == st.peek()){
                    st.pop();
                    answer+=2;
                }else if(temp !=0) st.push(temp);
            }else if(temp !=0) st.push(temp);
            
            board[a][moves[i]-1] = 0;
        }
        
        return answer;
    }
}