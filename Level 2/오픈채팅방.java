import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int len = record.length;
        
        for(String records : record){
            String[] s = records.split(" ");
            if(s[0].equals("Enter")){
                map.put(s[1],s[2]);
            }else if(s[0].equals("Change")){
                map.put(s[1],s[2]);
                len--;
            }
        }
        
        String[] answer = new String[len];
        int idx = 0;
        for(String result : record){
            String[] s = result.split(" ");
            String name = map.get(s[1]);
            if(s[0].equals("Enter")){
                answer[idx++] = name + "님이 들어왔습니다.";
            }else if(s[0].equals("Leave")){
                answer[idx++] = name + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}