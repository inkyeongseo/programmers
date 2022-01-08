import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String a = s.charAt(0)+"";
        sb.append(a.toUpperCase());
        
        for(int i = 1; i < s.length();i++){
           String ch = s.charAt(i)+"";
           if(s.charAt(i-1) == ' '){
               sb.append(ch.toUpperCase());
           }else{
               sb.append(ch.toLowerCase());
           }
        }
        return sb.toString();
    }
}