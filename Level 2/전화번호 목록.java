import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(int i = 0; i < phone_book.length; i++){
            hash.put(phone_book[i],i);
        }
        
        for(String s : phone_book){
            for(int j = 0; j < s.length(); j++){
                if(hash.containsKey(s.substring(0, j))){
                    answer = false;
                }
            }
        }
        
        
        return answer;
    }
}