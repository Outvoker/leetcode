public class Solution {
    static boolean[][] board;

    public static int dfs(int x, int y, int k) {
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length) return 0;
        if(board[x][y]) return 0;
        if(x/10 + x % 10 + y / 10 + y % 10 > k) return 0;
        board[x][y] = true;
        return dfs(x + 1, y, k) + dfs(x, y + 1, k) + 1;
    }


    public static int movingCount(int m, int n, int k) {
        board = new boolean[m][n];
        return dfs(0, 0, k);
    }

    public static void main(String[] args) {
        System.out.println(movingCount(2,3,81));
    }
}
