class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        
        long gcd = gcd(w, h);
        return ((long)w * (long)h)-((((long)w/gcd) + ((long)h/gcd) -1)*gcd);
    }
    public int gcd(int x, int y)
    {
        while (y != 0)
        {
            int tmp = x % y;
            x = y;
            y = tmp;
        }  
        return x;
    }
}
