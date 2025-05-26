class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        
    int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[]{entrance[0], entrance[1], 0});
    boolean[][] visited = new boolean[maze.length][maze[0].length];
    while (!q.isEmpty()) {
        int[] current = q.poll();
        int r = current[0], c = current[1], steps = current[2];

    
        if ((r == 0 || r == maze.length - 1 || c == 0 || c == maze[0].length - 1) &&
            !(r == entrance[0] && c == entrance[1])) {
            return steps;
        }

    
        for (int[] dir : directions) {
            int newRow = r + dir[0], newCol = c + dir[1];
            if (newRow >= 0 && newRow < maze.length && newCol >= 0 && newCol < maze[0].length &&
                maze[newRow][newCol] == '.' && !visited[newRow][newCol]) {
                q.offer(new int[]{newRow, newCol, steps + 1});
                 visited[newRow][newCol] = true; 
            }
        }
    }
return -1;
}
}