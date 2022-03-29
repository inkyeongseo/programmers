import java.util.*;

class Solution {
    
    List<String> answerList = new ArrayList<>();
    Map<String, Integer> hashMap = new HashMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        //order 정렬
        for(int i = 0; i < orders.length; i++){
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }
        
        //order를 기준으로 course 길이만큼 조합 만들기
        for(int courseLength : course){
            for(String order : orders){
                combination("", order, courseLength);
            }
            
            //가장 큰 값을 answer에 저장
            if(!hashMap.isEmpty()){
                List<Integer> countList = new ArrayList<>(hashMap.values());
                int max = Collections.max(countList);
                
                if(max > 1){
                    for(String key : hashMap.keySet()){
                        if(hashMap.get(key) == max) answerList.add(key);
                    }
                }
                hashMap.clear();
            }
        }
        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
    
    public void combination(String order, String others, int count){
        //탈출 동작
        if(count == 0){
            hashMap.put(order, hashMap.getOrDefault(order,0)+1);
            return;
        }
        
        //수행 동작
        for(int i = 0; i< others.length(); i++){
            combination(order + others.charAt(i), others.substring(i+1), count-1);
        }
    }
}

// 출처 : https://www.youtube.com/watch?v=Jb34jY91450&list=PLlV7zJmoG4XI9VguUVNMu3pCjssb4aR_0&index=8 