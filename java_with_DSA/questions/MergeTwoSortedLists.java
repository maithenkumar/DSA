//https://leetcode.com/problems/maximum-product-subarray/?ref=localhost
package questions;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp = 1;
        if (nums.length == 1) {
            return nums[0];

        }
        for (int j = 0; j < nums.length; j++) {
            temp = nums[j];
            for (int i = 0; i < nums.length; i++) {
                if (j != i)
                    temp *= nums[i];
                if (temp > max) {
                    max = temp;

                }

                temp = 1;
            }

        }
        return max;

    }

    public static int maxProduct2(int[] nums) {

        int max = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (i != j)
                    product *= nums[j];
                if (product > max) {
                    max = product;
                }
            }
            product = 1;
        }
        return max;

    }
}