class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int freshOranges=0;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{ i,j});
                   
                }
                else if(grid[i][j]==1){
                    freshOranges++;
                }
            }
        }
       
        int minutes=0;
       while(!q.isEmpty()){
            boolean rottedThisMinute = false;
            int size= q.size();
            for(int i=0;i<size;i++){
                int[] current = q.poll();
                int r=current[0] , c=current[1];
                for (int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2; 
                        q.offer(new int[]{nr, nc});
                        freshOranges--;
                        rottedThisMinute = true;
                    }
                }
            
            }
            if (rottedThisMinute) minutes++;

        }
    return freshOranges == 0 ? minutes : -1;  }
}