import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr); //오름차순 정렬
        
        for(int i = arr.length-1; i >= 0; i--){
            answer+= arr[i];
        }
        
        return Long.parseLong(answer);
    }
}