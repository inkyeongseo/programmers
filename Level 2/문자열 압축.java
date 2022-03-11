class Solution {
    public int solution(String s) {
        int answer = s.length();
        int len = s.length()/2;
        
        if(s.length() == 1) return 1;
        
        for(int i = 1; i <= len; i++){
            int cnt = 1;
            String ch = s.substring(0,i);
            StringBuilder sb = new StringBuilder();
            
            for(int j = i; j <= s.length(); j+=i){
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
                if(ch.equals(next)){
                    cnt++;
                }else{
                    if(cnt != 1) sb.append(cnt);
                    sb.append(ch);
                    ch = next;
                    cnt = 1;
                }
            }
            sb.append(ch);
            answer = Math.min(answer, sb.length());
        }  
        return answer;
    }
}