class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int max = 0;
        int count = 0;
        int len = number.length() - k;
        
        
        for(int i = 0; i < len; i++){
            max = 0;
            for(int j = count; j <= i+k; j++){
                if(max < number.charAt(j) - '0'){
                    max = number.charAt(j) - '0';
                    count = j+1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}