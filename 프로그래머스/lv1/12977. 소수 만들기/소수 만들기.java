class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    //소수인지 확인
                    int num = nums[i]+nums[j]+nums[k];
                    boolean chk = true;
                    for(int n=2 ; n<num; n++){
                        if(num%n==0){
                            chk = false;
                            break;
                        }
                    }
                    
                    if(chk==true) answer++;
                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}