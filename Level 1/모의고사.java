import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] ch = {0,0,0};
        int[][] nums ={{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        // 5 8 10
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == nums[0][i%5]){ch[0] += 1;}
            if(answers[i] == nums[1][i%8]){ch[1] += 1;}
            if(answers[i] == nums[2][i%10]){ch[2] += 1;}
        }
        
        int max = Math.max(ch[0], Math.max(ch[1],ch[2]));
        for(int j = 0; j < ch.length; j++){
            if(max == ch[j]){
                list.add(j+1);
            }
        }
        
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}