package CuriousFreaksCodingSheet.Array.java;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = new int[2];
        System.out.println(arr[1]);

        System.out.println(Arrays.toString(productExceptSelf3(new int[] { 1, 2, 3, 4 })));

    }

    public static int[] productExceptSelf2(int[] nums) {

        int[] ans = new int[nums.length];
        int p = 1;
        int q = 1;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != 0) {

                ans[i] *= p;
                p *= nums[i];
            }
            if (ans[i] == 0) {
                ans[i] = p;
                p *= nums[i];
            }

            if (ans[nums.length - i - 1] != 0) {
                ans[(nums.length - i) - 1] *= q;
                q *= nums[(nums.length - i) - 1];
            }
            if (ans[nums.length - i - 1] == 0) {
                ans[(nums.length - i) - 1] = q;
                q *= nums[(nums.length - i) - 1];
            }
        }

        return ans;
    }

    public static int[] productExceptSelf3(int[] nums) {

            int[] ans = new int[nums.length];
            int p = 1;
            int q = 1;
            Arrays.fill(ans, 1);
            for (int i = 0; i < ans.length; i++) {
                ans[i] *= p;
                p *= nums[i];
                int j = nums.length - i - 1;
                ans[j] *= q;
                q *= nums[j];

            }

            return ans;

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int p = 1;

        for (int i = 0; i < ans.length; i++) {
            ans[i] = p;
            p *= nums[i];
        }
        p = 1;
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] *= p;
            p *= nums[i];
        }
        return ans;
    }
}
