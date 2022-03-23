import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if(cacheSize == 0) return cities.length * 5; //중요
        
        LinkedList<String> list = new LinkedList<>();
        
        for(int i = 0; i < cities.length; i++){
            
            //대소눔자 구분을 하지 않기 때문에
            cities[i] = cities[i].toUpperCase();
            
            if(list.remove(cities[i])){
                //list에서 삭제되면 true 반환
                list.add(cities[i]);
                answer += 1;
            }else{
                //miss인 경우
                if(list.size() == cacheSize){
                    list.remove(0);
                }
                list.add(cities[i]);
                answer += 5;
            }
            // System.out.print(list);
            // System.out.println("  : " + answer);
        }
        
        return answer;
    }
}