public class Solution {
    public static int[] printNumbers(int n) {
        int[] list = new int[(int) (Math.pow(10, n) - 1)];
        for(int i = 0; i <= list.length - 1; i++) list[i] = i + 1;
        return list;
    }

    public static void main(String[] args) {
        for (int i:printNumbers(3)
             ) {
            System.out.printf("%d ",i);

        }
    }
}
