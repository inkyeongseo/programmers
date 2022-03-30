import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {        
        int[] answer = new int[id_list.length];
        
        //report 중복 정보 제거
        HashSet<String> reportSet = new HashSet<String>();
        for(String rep : report) reportSet.add(rep);
        
        HashMap<String, ArrayList<String>> notifiyListHash = new HashMap<>();
        for(String rep : reportSet){
            int blank = rep.indexOf(" ");
            String reporter = rep.substring(0,blank);
            String reportee = rep.substring(blank+1);
            
            ArrayList<String> reporterList = notifiyListHash.getOrDefault(reportee, null);
            if(reporterList == null) reporterList = new ArrayList<>();
            
            reporterList.add(reporter);
            notifiyListHash.put(reportee, reporterList);
        }
        
        
        HashMap<String, Integer> reporterHash = new HashMap<>();
        
        for(ArrayList<String> notifyList : notifiyListHash.values()){
            if(notifyList.size() >= k){
                for(String reporter : notifyList){
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter,0)+1);
                }
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            answer[i] = reporterHash.getOrDefault(id_list[i],0);
        }
        
        
        return answer;
    }
}

// 출처 : https://www.youtube.com/watch?v=ncCUNOJUn9Q