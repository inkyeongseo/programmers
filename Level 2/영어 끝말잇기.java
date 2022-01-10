import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Queue<String> q = new LinkedList<>();
        q.offer(words[0]);
        for(int i = 1; i < words.length; i++){
            if(q.contains(words[i])){
                answer[0] = (i % n)+1;
                answer[1] = (i / n) +1;
                break;
            }else if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)){
                answer[0] = (i % n)+1;
                answer[1] = (i / n) +1;
                break;
            }
            q.offer(words[i]);
        }     
        return answer;
    }
}