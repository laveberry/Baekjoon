class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String ls = "147";
        String xs = "2580";
        String rs = "369";
        int[][] lot = {{0,3}, {2,3}};
        
        for(int n : numbers){
            String s = String.valueOf(n);
            if(ls.indexOf(s)!=-1) {
                answer+="L";
                lot[0][0] = 0;//1번열
                lot[0][1] = ls.indexOf(s);//왼손위치 지정
            }
            else if(rs.indexOf(s)!=-1) {
                answer+="R";
                lot[1][0] = 2;//3번열
                lot[1][1] = rs.indexOf(s);//오른손위치 지정
            }
            else if(xs.indexOf(s)!=-1){
                String flag = "";
                int idx = xs.indexOf(s);
                int _l = Math.abs(lot[0][1]-idx);
                int _r = Math.abs(lot[1][1]-idx);
                
                //열구분
                if((lot[0][0] != 1 && lot[1][0] !=1)||(lot[0][0]==1 && lot[1][0]==1)){}
                else if(lot[0][0] == 1) _r++;
                else _l++;

                if(_l==_r) flag = hand.equals("left") ? "L" : "R";
                else flag = _l < _r ? "L" : "R";
                
                answer+= flag;
 
                if(flag.equals("L")) {
                    lot[0][0] = 1;//2번열
                    lot[0][1] = xs.indexOf(s);
                }
                else {
                    lot[1][0] = 1;
                    lot[1][1] = xs.indexOf(s);
                }
            }
        }
        
        return answer;
    }
}