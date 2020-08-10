class Solution {
    //数学推导：当分成等长的绳段乘积最大，y=x^(1/x)极值点->e，尽可能分为3和2，优先3   数学归纳法也可证
    public static int cuttingRope(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n % 3 == 0) return (int) Math.pow(3, n / 3);
        else if (n % 3 == 1) return (int) Math.pow(3, n / 3 - 1) * 2 * 2;
        else return (int) Math.pow(3, n / 3) * 2;
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}