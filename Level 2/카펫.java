public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int w = 0;
        
        for(int h = 3; h <= sum; h++){
            w = sum / h;
            
            if(h >= w && w >=3){
                if((h-2) * (w-2) == yellow){
                    answer[0] = h;
                    answer[1] = w;
                }
            }
            
        }
        
        return answer;
    }
}
