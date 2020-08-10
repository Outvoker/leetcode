public class Solution3 {
    static StringBuilder res;
    static int nine = 0, count = 0, start, n;
    static char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static String printNumbers(int nn) {
        n = nn;
        res = new StringBuilder();
        num = new char[n];
        start = n - 1;
        dfs(0);
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
     public static void  dfs(int x) {
        if(x == n) {
            String s = String.valueOf(num).substring(start);
            if(!s.equals("0")) res.append(s + ",");
            if(n - start == nine) start--;
            return;
        }
        for(char i : loop) {
            if(i == '9') nine++;
            num[x] = i;
            dfs(x + 1);
        }
        nine--;
    }

    public static void main(String[] args) {
        System.out.println(printNumbers(6));
    }
}
