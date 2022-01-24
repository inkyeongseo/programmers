class Solution {
    public String solution(String s, int n) {
        String answer = "";
        System.out.println(s.length());
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            //소문자
            if(ch >= 'a' && ch <= 'z'){
                if(ch + n > 'z'){
                    answer += (char)(s.charAt(i)+n-26);
                } 
                else{
                    answer += (char)(s.charAt(i)+n);
                }
            }else if(ch >= 'A' && ch <= 'Z'){
                if(ch + n > 'Z'){
                    answer += (char)(s.charAt(i)+n-26);
                } 
                else{
                    answer += (char)(s.charAt(i)+n);
                }
            }else{
                answer += ' ';
            }
        }
        
        return answer;
    }
}