import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int j = 0; j < prices.length; j++){
            int cnt = 0;
            for(int k = j+1; k <prices.length; k++){
                if(prices[j] <= prices[k]){
                    cnt++;
                }else{
                    cnt++;
                    break;
                }
            }
            answer[j] = cnt;
        }
        
        return answer;
    }
}