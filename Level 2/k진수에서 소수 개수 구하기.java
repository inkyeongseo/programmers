class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String num = Integer.toString(n, k); //진수 변환
        // System.out.println(num);
        
        String[] nums = num.toString().split("0"); //0을 기준으로 잘라 배열에 넣기
        
        for(String i : nums){
            if(i.equals("")) continue;
            if(check(Long.valueOf(i))) answer++;
        }
        
        return answer;
    }
    public boolean check(Long num){
        if(num == 1) return false;
        
        //Math.sqrt를 이용해 제곱근까지만 확인하도록 함
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        
        return true;
    }
}