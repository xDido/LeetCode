class Solution {
   private boolean backtrack(char[][]board, String word, int i, int j,int index, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if (visited[i][j]) {
            return false;
        }
        if (board[i][j] != word.charAt(index)) {
            return false;
        }
        visited[i][j] = true;
        boolean found = backtrack(board, word, i + 1, j, index + 1, visited) ||
                backtrack(board, word, i - 1, j, index + 1, visited) ||
                backtrack(board, word, i, j + 1, index + 1, visited) ||
                backtrack(board, word, i, j - 1, index + 1, visited);
        visited[i][j] = false;
        return found;
    }

     public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(board, word, i, j, 0, new boolean[board.length][board[0].length])) {
                    return true;
                }
            }
        }
        return false;
    }
}