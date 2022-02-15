class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int v = 0; int h = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int max = Math.max(sizes[i][0],sizes[i][1]);
            int min = Math.min(sizes[i][0],sizes[i][1]);
            
            v = Math.max(v,max);
            h = Math.max(h,min);
        }
        return v*h;
    }
}