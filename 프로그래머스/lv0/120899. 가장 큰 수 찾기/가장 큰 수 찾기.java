import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int temp = array[0];
//         int[] newArr = array;
        
//         Arrays.sort(newArr);
//         answer[0] = newArr[newArr.length-1];
        //answer[1] = Arrays.asList(array).indexOf(answer[0]);
        for(int i=1 ; i<array.length ; i++){
            if(temp<array[i]) {
                temp=array[i];
                answer[0] = temp;
                answer[1] = i;
            }
        }
        
        
        return answer;
    }
}