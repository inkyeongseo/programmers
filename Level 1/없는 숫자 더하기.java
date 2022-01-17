import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] ch = new boolean[10];
        for(int n : numbers){
            ch[n] = true;
        }
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == false){
                answer += i;
            }
        }
        
        return answer;
    }
}