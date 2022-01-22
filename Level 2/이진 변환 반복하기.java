class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder();
        
        while(!s.equals("1")){
            answer[0]++;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1'){
                    sb.append(s.charAt(i));
                }else{
                    answer[1]++;
                }
            }
         
            s = Integer.toBinaryString(sb.length());

            sb.delete(0, sb.length());
        }

        return answer;
    }
}