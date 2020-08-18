public class Solution {
    public int[] exchange(int[] nums) {
        int tail = nums.length - 1;
        for(int i = 0; i < nums.length; i++) {
            if(i == tail) break;
            if((nums[i] & 1) == 0) {
                int tmp = nums[i];
                nums[i] = nums[tail];
                nums[tail] = tmp;
                tail--;
                i--;
            }
        }
        return nums;
    }
}
