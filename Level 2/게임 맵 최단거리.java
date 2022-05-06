import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        
        answer = bfs(maps, visited);
        if(answer == 0) return -1;
        return answer;
    }
    int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
    
    public int bfs(int[][] maps, int[][] visited){
        int x = 0, y = 0;
        visited[x][y] = 1; // 1 방문
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int prex = cur[0];
            int prey = cur[1];
            for(int[] dir : dirs){
                int x1 = prex + dir[0];
                int y1 = prey + dir[1];
                
                if(x1 < 0 || x1  > maps.length-1 || y1 < 0 || y1 > maps[0].length-1)
                    continue;
                if(visited[x1][y1] == 0 && maps[x1][y1] == 1){
                    visited[x1][y1] = visited[prex][prey] + 1;
                    queue.offer(new int[]{x1, y1});
                }
            }
            
        }
        
        return visited[maps.length-1][maps[0].length-1];
    }
}