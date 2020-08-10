package my.demo;

public class Solution {
    public static int findRepeatNumber(int[] nums) {
        boolean[] b = new boolean[nums.length];
        for(int num : nums) {
            if(b[num]) return num;
            b[num] = true;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
}