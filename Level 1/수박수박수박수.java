class Solution {
    public String solution(int n) {
        String answer = "";
        int test = 0;
        
        for(int i = 0 ; i < n; i++){
            if(test == 0){
                answer += "수";
                test = 1;
            }else{
                answer += "박";
                test = 0;
            }
        }
        
        return answer;
    }
}