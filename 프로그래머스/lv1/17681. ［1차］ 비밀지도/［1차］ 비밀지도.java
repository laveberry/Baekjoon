class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
      String temp;

      for(int i = 0 ; i < n ; i++){
          // 대응되는 비트 중에서 하나라도 1이면 1을 반환함. (비트 OR 연산)
          temp = String.format("%"+n+"s", Integer.toBinaryString(arr1[i] | arr2[i]));
          //temp = temp.substring(temp.length() - n);
          temp = temp.replaceAll("1", "#");
          temp = temp.replaceAll("0", " ");
          answer[i] = temp;
      }

      return answer;
  }
}
