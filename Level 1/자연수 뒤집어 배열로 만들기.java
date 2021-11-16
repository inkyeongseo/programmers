class Solution {
    public int[] solution(long n) {
        String num = ""+n; 
        int[] answer = new int[num.length()];
        
        for(int i = 0; i < num.length();i++){
            answer[i] = (int)(n%10); //괄호 유의
            n = n/10;
        }
        return answer;
    }
}