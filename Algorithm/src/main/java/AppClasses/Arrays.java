class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
        } else {
            recurUpdateBoard(board, click[0], click[1]);
        }
        return board;
    }

    private void recurUpdateBoard(char[][] board, int r, int c) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) {
            return;
        } else if (board[r][c] == 'E') {
            int adjMines = getAdjacentMines(board, r, c);
            if (adjMines > 0) {
                board[r][c] = Character.forDigit(adjMines, 10);
            } else {
                board[r][c] = 'B';
                recurUpdateBoard(board, r - 1, c);
                recurUpdateBoard(board, r - 1, c + 1);
                recurUpdateBoard(board, r, c + 1);
                recurUpdateBoard(board, r + 1, c + 1);
                recurUpdateBoard(board, r + 1, c);
                recurUpdateBoard(board, r + 1, c - 1);
                recurUpdateBoard(board, r, c - 1);
                recurUpdateBoard(board, r - 1, c - 1);
            }
        }
    }

    private int getAdjacentMines(char[][] board, int r, int c) {
        int startRow = r - 1;
        int startColumn = c - 1;
        int numMines = 0;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startColumn; j < startColumn + 3; j++) {
                if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || (i == r && j == c)) {
                    continue;
                }

                if (board[i][j] == 'M') {
                    numMines++;
                }
            }
        }
        return numMines;
    }

}