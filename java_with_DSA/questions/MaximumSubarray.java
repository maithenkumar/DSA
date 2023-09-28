package questions;


public class MaximumSubarray {
    public static void main(String[] args) {
        // int [] arr={-1,0};
        // int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int [] arr={5,4,-1,7,8};
        int arr[]= {1};
        System.out.println(maxSubArraySum(arr));

    }

    public static int maxSubArraySum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max=Math.max(sum, max);
            if (sum<0)sum=0;

        }
        return max;

    }
}