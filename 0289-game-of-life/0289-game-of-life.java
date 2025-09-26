class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1}, {1, 0},  {1, 1}
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbors = 0;

               
                for (int[] d : directions) {
                    int ni = i + d[0], nj = j + d[1];
                    if (ni >= 0 && ni < rows && nj >= 0 && nj < cols &&
                       (board[ni][nj] == 1 || board[ni][nj] == 2)) {
                        liveNeighbors++;
                    }
                }

                
                if (board[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[i][j] = 2; 
                    }
                } else {
                    if (liveNeighbors == 3) {
                        board[i][j] = 3; 
                    }
                }
            }
        }

      
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 2) board[i][j] = 0;
                else if (board[i][j] == 3) board[i][j] = 1;
            }
        }
    }
}
