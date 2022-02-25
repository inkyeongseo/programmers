import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] check = new double[N+1];
        
        for(int i : stages){
            if(i == N+1) continue;
            check[i]++;
        }
        ArrayList<Double> fail = new ArrayList<Double>();
        double num = stages.length;
        double tmp = 0;
        
        for(int i = 1; i < check.length; i++){
            tmp = check[i];
            
            if(num == 0){
                check[i] = 0;
            }else{
                check[i] = check[i] / num;
                num -= tmp;
            }
            
            fail.add(check[i]);
        }
        
        Collections.sort(fail,Collections.reverseOrder());
        
        for(int i = 0; i < fail.size(); i++){
            for(int j = 1; j < check.length; j++){
                if(fail.get(i) == check[j]){
                    answer[i] = j;
                    check[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}