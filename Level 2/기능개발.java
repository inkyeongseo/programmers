import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int[] ch = new int[speeds.length];
        
        for(int i = 0; i < progresses.length;i++){
            int tmp = progresses[i];
            int day = 0;
            while(tmp < 100){
                tmp += speeds[i];
                day++;
            }
            ch[i] = day;
            
        }
        

        for(int i = 0; i< ch.length; i++){
            int count = 0;
            for(int j = i; j < ch.length; j++){
                if(ch[j] <= ch[i]){
                    count++;
                }else{
                    break;
                }
            }
            i = i + count-1;
            q.offer(count);
        }
        int[] answer = new int[q.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = q.poll();
        }
        
        return answer;
    }
}