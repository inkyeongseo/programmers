class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '1'){
                count++;
            }
        }
        
        int a = 0;
        while(true){
            n++;
            a = 0;
            String ch = Integer.toBinaryString(n);
            for(int i = 0; i < ch.length(); i++){
                if(ch.charAt(i) == '1'){
                    a++;
                }
            }
            if(count == a){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}