class Solution {
    //(xy)⊙p=[(x⊙p)(y⊙p)]⊙p

    public static int cuttingRope(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n % 3 == 0) return (int) quickPow(3, n / 3);
        else if (n % 3 == 1) return (int) (quickPow(3, n / 3 - 1) * 4 % 1000000007);
        else return (int) (quickPow(3, n / 3) * 2 % 1000000007);
    }
    //快速幂
    private static long quickPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        long y = quickPow(x, n / 2);
        return (n & 1) == 1 ? (y * y * x) % 1000000007 : (y * y) % 1000000007;
    }
    //循环求余
//    public static int cuttingRope(int n) {
//        if(n == 2) return 1;
//        if(n == 3) return 2;
//        long pow = 1;
//        while(n > 4) {
//            n -= 3;
//            pow = pow * 3 % 1000000007;
//        }
//        return (int) (pow * n % 1000000007);
//    }
    public static void main(String[] args) {
        System.out.println(cuttingRope(122));
    }

}