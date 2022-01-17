import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        if(arr.length == 1){
            return new int[]{-1};
        }
      
        int min = arr[0];
        for(int n : arr){
            min = Math.min(min, n);
        }
        
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(min != arr[i]){
                answer[count] += arr[i];
                count++;
            }
        }

        return answer;
    }
}