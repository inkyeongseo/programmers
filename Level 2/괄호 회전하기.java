import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            stack.clear();
            for(int j = 0; j < s.length(); j++){
                // System.out.println(s.charAt(j)+ " j번은 " + j);
                if(stack.isEmpty()){
                    stack.push(s.charAt(j));
                }else{
                    if(s.charAt(j) == ')' && stack.peek() == '('){
                        stack.pop();
                    }else if(s.charAt(j) == ']' && stack.peek() == '['){
                        stack.pop();
                    }else if(s.charAt(j) == '}' && stack.peek() == '{'){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(j));
                    }
                }
                // System.out.println(stack);
            }
            if(stack.isEmpty()) answer++;
            s = s.substring(1,s.length()) + s.charAt(0);
        }
        
        return answer;
    }
}