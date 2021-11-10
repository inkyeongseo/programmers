class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        
        if(num == (int)num){
            return (long)Math.pow(num+1,2);
        }else{
            answer = -1;
        }
        
        return answer;
    }
}