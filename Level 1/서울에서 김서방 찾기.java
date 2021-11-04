class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        //문자열에서 같은 값 찾을 때 equals를 써야함!!

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }
}