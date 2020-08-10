public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n = n >>> 1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(0b11111111111111111111111111111101));
    }
}
