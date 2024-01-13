package questions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 616975, 219674, 735709, 19659,19659,19659,19659,19659,
               };
         rotate2(arr, 5);

    }

    public static void rotate2(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reverseNum(nums, 0, n - 1);
       reverseNum(nums, 0, k - 1);
        reverseNum(nums, k, n - 1);
    }

    public  static void reverseNum(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        System.out.println(k);

        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];

            }
            nums[0] = temp;
        }
        // System.out.println(Arrays.toString(nums));
    }
}
