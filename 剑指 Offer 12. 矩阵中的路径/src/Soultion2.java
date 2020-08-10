public class Soultion2 {
    static char[][] board;
    static String word;
    static int index;


    public static boolean dfs(int x, int y) {
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
        if(board[x][y] != '0' && board[x][y] == word.charAt(index) ) {
            index++;
            char tmp = board[x][y];
            board[x][y] = '0';
            if(index == word.length()) return true;
            if(dfs(x + 1, y) ||
                    dfs(x - 1, y) ||
                    dfs(x, y + 1) ||
                    dfs(x, y - 1)) {
                board[x][y] = tmp;
                return true;
            }
            else {
                index--;
                board[x][y] = tmp;
                return false;
            }
        }
        else return false;

    }

    public static boolean exist(char[][] b, String w) {
        if(w.length() == 0) return true;
        board = b;
        word = w;
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
//        char[][] board = {
//                {'A','B','C','E'},
//                {'S','F','E','S'},
//                {'A','D','E','E'}
//        };
        char[][] board = {
                {'a', 'a'}

        };
        String word = "aa";
        System.out.println(exist(board, word));

    }
}
