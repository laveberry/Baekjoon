class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i=0; i<arr1.length ; i++){
            String a = "", b = "";
            String _a = Integer.toBinaryString(arr1[i]);
            String _b = Integer.toBinaryString(arr2[i]);
            answer[i] = "";
            
            if(n-_a.length()>0){
                for(int j=0 ; j<n-_a.length() ;j++) a+="0";
            }
            if(n-_b.length()>0){
                for(int j=0 ; j<n-_b.length() ;j++) b+="0";
            }
            a+=_a;
            b+=_b;
            
            for(int k=0 ; k<n ; k++){
                int chk = 0;
                int chk2 = 0;
                
                if(a.charAt(k)=='1') chk=1;
                if(b.charAt(k)=='1') chk2=1;
                
                if(chk==0 && chk2==0) answer[i]+=" ";
                else answer[i]+="#";
            }

        }

        return answer;
    }
    
}