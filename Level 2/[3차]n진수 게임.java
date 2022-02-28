class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i <= t * m; i++){
            sb.append(Integer.toString(i, n));
        }
        p = p-1;
        for(int j = 0; j < t; j++){
            answer.append(sb.charAt(p));
            p = p + m;
        }        
        return answer.toString().toUpperCase();
    }
}