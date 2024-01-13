package SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int nums[] = { 5,3,5,2,5,3};
        System.out.println(minSubArrayLen3(5, nums));

    }

    public static int minSubArrayLen3(int target, int[] nums) {
        int max = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < nums.length) {
            sum += nums[j];
            if (sum == target) {
                if (max > ((j - i) + 1)) {
                    max = (j - i) + 1;

                }
                i += 1;
                j = i;
                sum = 0;
            }  if (j >= nums.length - 1) {
                i += 1;
                j = i;  
                sum=0;
            } else {
                j++;
            }
        }
        return max;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            int index = 0;
            for (int j = i; j < nums.length; j++) {
                index += 1;
                temp += nums[j];
                if (temp == target) {
                    count = Math.min(count, index);
                    break;
                }
            }
        }
        System.out.println(count);
        return count == Integer.MAX_VALUE ? 0 : count;
    }
}