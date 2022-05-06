import java.util.*;
class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        int[][] copy = new int[board.length+1][board[0].length+1];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                copy[i+1][j+1] = board[i][j];
            }
        }
    
        for(int i = 1; i < copy.length; i++){
            for(int j = 1; j < copy[i].length; j++){
                if(copy[i][j] == 1){
                    int x = copy[i-1][j]; // 왼쪽
                    int y = copy[i][j-1]; // 위쪽
                    int z = copy[i-1][j-1]; // 왼쪽 대각선 위
                    int min = Math.min(x, Math.min(y,z));
                    copy[i][j] = min+1;
                    answer = Math.max(answer, min+1);
                }
            }
        }
        return answer * answer;
    }
}