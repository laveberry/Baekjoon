class Solution {
    public String solution(String my_string, int n) {        
        StringBuffer str = new StringBuffer();
        String[] arr = my_string.split("");
        
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<n ; j++){
                str.append(arr[i]);
            }      
        }
        return str.toString();
    }
}