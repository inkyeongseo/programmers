import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length;i++){
            q.offer(scoville[i]);
        }
        
        while(q.peek() <= K){
            if (q.size() == 1) {
                return -1;
            }
            int min = q.poll();
            int min2 = q.poll();

            int num = min + (min2*2);
            q.offer(num);
            answer++;
        }
        
        return answer;
    }
}