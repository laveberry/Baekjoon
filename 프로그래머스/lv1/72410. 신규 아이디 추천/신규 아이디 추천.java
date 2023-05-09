class Solution {
    public String solution(String new_id) {
//         //1단계
//         new_id = new_id.toLowerCase();
//         //2단계
//         new_id=new_id.replaceAll("[^a-z0-9-_.]", "");
//         //3단계
//         char[] id = new_id.toCharArray();  
//         String answer = String.valueOf(id[0]);
//         char temp = id[0];
//         for(int i=1 ; i<id.length ; i++){
//             if(!('.'==temp && '.'==id[i])) {
//                 answer+=id[i];
//                 temp = id[i];
//             }                                
//         }
        
//         //4단계
//         if('.' == answer.charAt(0)) answer= answer.substring(1,answer.length());
//         if(answer.length() > 0 && '.' == answer.charAt(answer.length()-1)) answer= answer.substring(0, answer.length()-1);
        
//         //5단계
//         if(answer.equals("")) answer = "a";
        
//         //6단계
//         if(answer.length()>15) answer = answer.substring(0, 15);
//         if('.' == answer.charAt(answer.length()-1)) answer= answer.substring(0, answer.length()-1);
        
//         //7단계
//         if(answer.length()<3) {
//             String t = answer.substring(answer.length()-1, answer.length());
//             while(answer.length()<3){
//                 answer+=t;
//             }
//         }
//         return answer;

        
        String answer = new_id.toLowerCase(); // 1단계

        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2단계
        answer = answer.replaceAll("[.]{2,}", "."); // 3단계
        answer = answer.replaceAll("^[.]|[.]$", "");    // 4단계
        
        if (answer.equals("")) {    // 5단계
            answer += "a";
        }

        if (answer.length() >= 16) {     // 6단계
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }

        if (answer.length() <= 2) {  // 7단계
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
        
        
    }
}