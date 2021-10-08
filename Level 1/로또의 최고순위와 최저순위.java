class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int win = 0; // min값임
        
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
            }else{
                for(int j = 0;j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        win++;    
                    }
                }
            }
        }
        
        int max = win+zero;
        
        
        answer[0] = Math.min(7 - max, 6);
        answer[1] = Math.min(7 - win, 6);
                      
        return answer;
    }
}