class Solution {
    public int solution(int n) {
        int[] fibo = new int[n+1];
        
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i = 2;i <= n;i++){
            int sum = fibo[i-1]+ fibo[i-2];
            fibo[i] = sum % 1234567;  // 중요! 단위가 커질수록 자료형 타입을 생각해야 한다
        }

        return fibo[n];
    }
}