import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hash = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            //System.out.println(clothes[i][1]);
            hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1],0)+1);
        }
        
        for(String key : hash.keySet()){
            answer *= (hash.get(key)+1); //입지 않는 경우의 수를 하나 더해 줌
            //System.out.println(answer);
        }
        
        return answer-1; //아무것도 입지 않은 경우를 마지막에 빼줌
    }
}