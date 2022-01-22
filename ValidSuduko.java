// LeetCode Question - 36

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = board.length;

        final Set<Character> seenRow = new HashSet<>();
        final Set<Character> seenCol = new HashSet<>();
        final Set<Character> seenGrid = new HashSet<>();
        for(int r = 0; r < N; r++) {
            for(int c = 0; c < N; c++) {
                char row = board[r][c];
                char col = board[c][r];

                int gridRow = (3 * (r / 3)) + c / 3;
                int gridCol = (3 * (r % 3)) + c % 3;

                char grid = board[gridRow][gridCol];

                if (row != '.') {
                    if (!seenRow.add(row)) {
                        return false;
                    }
                }

                if (col != '.') {
                    if (!seenCol.add(col)) {
                        return false;
                    }
                }

                if (grid != '.') {
                    if (!seenGrid.add(grid)) {
                        return false;
                    }
                }
            }
            seenRow.clear();
            seenCol.clear();
            seenGrid.clear();
        }
        return true;
    }
}
