public class Solution {
    //二分

    public static double myPow(double x, int n) {
        if(n == 0) return 1.0;
        else if(n > 0)
            return (n & 1) == 1 ? x * myPow(x * x, (n - 1) / 2) : myPow(x * x, n / 2);
        else
            return (n & 1) == 1 ? 1 / x * myPow(1 / (x * x), - ((n + 1) / 2)) : myPow(1 / (x * x), - (n / 2));
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2147483648));
    }
}
