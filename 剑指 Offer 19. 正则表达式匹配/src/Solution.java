public class Solution {
    /*
    转移方程:
    1.p[j - 1]为普通字符,若s[i - 1] == p[j - 1]，则dp[i][j] = dp[i - 1][j - 1]，否则匹配失败
    2.p[j - 1]为'.'，则dp[i][j] = dp[i - 1][j - 1]
    3.p[j - 1]为'*'：
        (1)不看，则dp[i][j] = dp[i][j - 2]
        (2)看，则dp[i][j] = dp[i - 1][j]
    */
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for(int i = 0; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(p.charAt(j - 1) != '*') {
                    if(i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) dp[i][j] = dp[i - 1][j - 1];
                }
                else { //p.charAt(j - 1) == '*'
                    if(j > 1) dp[i][j] |= dp[i][j - 2];
                    if(i > 0 && j > 1 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) dp[i][j] |= dp[i - 1][j];
                }
            }
        }
//        for(int i = 0; i <= m; i++) {
//            for(int j = 0; j <= n; j++) {
//                if(dp[i][j]) System.out.print("√");
//                else System.out.print("×");
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        return dp[m][n];
    }

    public boolean isMatch2(String A, String B) {
        int n = A.length();
        int m = B.length();
        boolean[][] f = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                //分成空正则和非空正则两种
                if (j == 0) {
                    f[i][j] = i == 0;
                } else {
                    //非空正则分为两种情况 * 和 非*
                    if (B.charAt(j - 1) != '*') {
                        if (i > 0 && (A.charAt(i - 1) == B.charAt(j - 1) || B.charAt(j - 1) == '.')) {
                            f[i][j] = f[i - 1][j - 1];
                        }
                    } else {
                        //碰到 * 了，分为看和不看两种情况
                        //不看
                        if (j >= 2) {
                            f[i][j] |= f[i][j - 2];
                        }
                        //看
                        if (i >= 1 && j >= 2 && (A.charAt(i - 1) == B.charAt(j - 2) || B.charAt(j - 2) == '.')) {
                            f[i][j] |= f[i - 1][j];
                        }
                    }
                }
            }
        }
//        for(int i = 0; i <= n; i++) {
//            for(int j = 0; j <= m; j++) {
//                if(f[i][j]) System.out.print("√");
//                else System.out.print("×");
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        return f[n][m];
    }
}
