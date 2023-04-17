import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[i].length ; j++){
                int nx = i;
                int ny = j;
                if(board[i][j]==1){
                    map.put(reNm(i,j), 1);
                    //대각선위
                    if(i-1>=0){
                        map.put(reNm(i-1, j), 1);
                        if(j-1>=0) map.put(reNm(i-1, j-1), 1);
                        if(j+1<board[i].length) map.put(reNm(i-1, j+1), 1);
                    }
                    //같은라인
                    if(j-1>=0) map.put(reNm(i, j-1), 1);
                    if(j+1<board[i].length) map.put(reNm(i, j+1), 1);
                    //맨 밑 라인
                    if(i+1<board.length){
                        map.put(reNm(i+1, j), 1);
                        if(j-1>=0) map.put(reNm(i+1, j-1), 1);
                        if(j+1<board[i].length) map.put(reNm(i+1, j+1), 1);
                    }                    
                }
            }
        }
        
        answer = (board.length * board[0].length) - map.size();
        
        return answer;
    }
    
    public String reNm(int a, int b){
        return String.valueOf(a) + String.valueOf(b);
    }
}