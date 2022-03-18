import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities){
            pq.offer(i);
        }
        
        while(!pq.isEmpty()){
            for(int j = 0; j < priorities.length; j++){
                if(pq.peek() == priorities[j]){
                    if(location == j){
                        answer++;
                        return answer;
                    }
                    answer++;
                    pq.poll();
                }
            }
        }
        
        return answer;
    }
}