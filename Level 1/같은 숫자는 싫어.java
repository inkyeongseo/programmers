import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for(int i = 1; i < arr.length; i++){
           if(arr[i] == arr[i-1]){
               continue;
           }else{
               sb.append(arr[i]);
           }
        }
        
        
        int[] answer = new int[sb.length()];
        
        for(int j = 0; j < sb.length(); j++){
            answer[j] = Character.getNumericValue(sb.charAt(j));
        }
        return answer;
    }
}