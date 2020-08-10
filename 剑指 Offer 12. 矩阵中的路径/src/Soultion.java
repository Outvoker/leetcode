import java.util.HashMap;

public class Soultion {
    static char[][] board;
    static String word;
    static boolean[][] flag;
    static int index;


    public static void init() {
        for(int i = 0; i < flag.length; i++) {
            for(int j = 0; j < flag[0].length; j++) {
                if(i == 0 || i == flag.length - 1 || j == 0 || j == flag[0].length - 1) flag[i][j] = true;
                else flag[i][j] = false;
            }
        }
    }

    public static boolean dfs(int x, int y) {
        if(!flag[x + 1][y + 1] && board[x][y] == word.charAt(index) ) {
            index++;
            flag[x + 1][y + 1] = true;
            if(index == word.length()) return true;
            if(dfs(x + 1, y) || dfs(x - 1, y) || dfs(x, y + 1) || dfs(x, y - 1)) {
                flag[x + 1][y + 1] = false;
                return true;
            }
            else {
                index--;
                flag[x + 1][y + 1] = false;
                return false;
            }
        }
        else return false;

    }

    public static boolean exist(char[][] b, String w) {
        if(w.length() == 0) return true;
        board = b;
        word = w;
        flag = new boolean[b.length + 2][b[0].length + 2];
        init();
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[0].length; j++) {
                index = 0;
                if(dfs(i, j)) return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
//        char[][] board = {
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
//                };
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','E','S'},
                {'A','D','E','E'}
        };
        String word = "ABCESEEEFS";
        System.out.println(exist(board, word));

    }
}
