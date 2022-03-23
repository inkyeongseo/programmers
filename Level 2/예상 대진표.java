class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        while(a != b){
            a = (a/2) + (a%2);
            b = (b/2) + (b%2);
            answer++;
        }
        
        //홀수인 경우 1을 더하기 위해 (a%2)로 계산해 더함 

        return answer;
    }
}