import java.util.*;

class Solution {
    int pos;
    public String solution(String p) {
        
        if(p.isEmpty()) return p;
        
        boolean correct = isCorrect(p);
        String u = p.substring(0,pos);
        String v = p.substring(pos, p.length());
        
        if(correct){
            return u + solution(v);
        }
        
        String answer = "(" + solution(v) + ")";
        
        //4-4
        for(int i = 1; i < u.length()-1; ++i){
            if(u.charAt(i)=='('){
                answer += ")";
            }else{
                answer += "(";
            }
        }
        
        return answer;
    }
    
    boolean isCorrect(String str){
        boolean ret = true;
        int left = 0, right = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == '('){
                left++;
                stack.push('(');
            }else{
                right++;
                if(stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
            if(left == right){
                pos = i + 1;
                return ret;
            }
        }
        return true;
    }
}

//참고 : https://www.youtube.com/watch?v=Bc34h7xPTL8&t=22s