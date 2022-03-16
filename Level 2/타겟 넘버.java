class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {        
        
        dfs(numbers,target,0,0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int depth, int sum){
        if(depth == numbers.length){
            if(sum == target) answer++;
        }else{
            dfs(numbers,target,depth+1,sum+numbers[depth]); //더하기
            dfs(numbers,target,depth+1,sum-numbers[depth]); //빼기
        }
    }
}