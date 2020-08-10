package my.demo;

public class DivideConquer {
    static int[] nums;
    public static int search(int i, int j) {
        if(nums[i] < nums[j]) return nums[i];
        if(i >= j) return Math.min(nums[i], nums[j]);
        int m = i + (j - i) / 2;
        return Math.min(search(i, m), search(m + 1, j));
    }

    public static int minArray(int[] numbers) {
        nums = numbers;
        return search(0, numbers.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(minArray(a));
    }
}
