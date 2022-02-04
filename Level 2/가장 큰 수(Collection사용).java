import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            arr.add(String.valueOf(numbers[i]));
        }
        
        Collections.sort(arr,(a,b)->(b+a).compareTo(a+b));
        
        if(arr.get(0).equals("0")) return "0";
        
        for(String s : arr){
            answer += s;
        }
        
        return answer;
    }
}