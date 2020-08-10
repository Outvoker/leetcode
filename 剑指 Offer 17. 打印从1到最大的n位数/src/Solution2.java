public class Solution2 {
    //大数问题
    //String StringBuffer StringBuilder
    //https://blog.csdn.net/csxypr/article/details/92378336
    static StringBuilder res;
    static char[] num, list = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static int n;


    public static String printNumbers(int nn) {
        n = nn;
        res = new StringBuilder();
        num = new char[n];
        dfs(0);
        res.deleteCharAt(0);
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public static void dfs(int x){
        if(x == n) {
            int i = 0;
            for(; i < n; i++) {
                if (num[i] != '0') break;
            }
//            res.append(String.valueOf(num).substring(i) + " ");
            System.out.println(String.valueOf(num).substring(i) + " ");
            return;
        }
        for(char c : list) {
            num[x] = c;
            dfs(x + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(printNumbers(20));
    }
}
