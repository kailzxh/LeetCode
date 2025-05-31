class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n * n + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 0}); 
        visited[1] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int pos = current[0];
            int moves = current[1];

            if (pos == n * n) return moves; 

            for (int i = 1; i <= 6 && pos + i <= n * n; i++) {
                int next = pos + i;
                int[] coords = getCoordinates(next, n);
                int row = coords[0];
                int col = coords[1];

                if (board[row][col] != -1) {
                    next = board[row][col];
                }

                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, moves + 1});
                }
            }
        }

        return -1; 
    }

   
    private int[] getCoordinates(int pos, int n) {
        int row = n - 1 - (pos - 1) / n;
        int col = (pos - 1) % n;

        if (((n - row) % 2) == 0) { 
            col = n - 1 - col;
        }

        return new int[]{row, col};
    }
}
