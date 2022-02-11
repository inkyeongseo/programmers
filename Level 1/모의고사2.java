import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] one = {1, 2, 3, 4, 5}; //5
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5,};  //8
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        
        int[] score = {0,0,0};
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == one[i%5]) score[0]++;
            if(answers[i] == two[i%8]) score[1]++;
            if(answers[i] == three[i%10]) score[2]++;
        }
        
        int max = Math.max(Math.max(score[0],score[1]),score[2]);
        
        for(int j = 0; j < score.length; j++){
            if(score[j] == max) list.add(j+1);
        }
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}