public class Solution2 {
    //位运算
    public static double myPow(double x, int n) {
        long nn = n;
        if(n < 0) {
            nn = -nn;
            x = 1 / x;
        }
        double res = 1;
        while(nn != 0){
            if((nn & 1) == 1) res *= x;
            x *= x;
            nn >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 2));
    }
}
