//https://leetcode.com/problems/move-zeroes/description/
package questions;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = { 0,1,0,3,12 };
        moveZeroes2(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void moveZeroes2(int[] nums) {
        int index=0;
        for (int  num : nums) {
            if (num!=0) {
                nums[index++]=num;
            }

        }
        while (index<nums.length) {
            nums[index++]=0;

        }




    }
    public static void moveZeroes(int[] nums) {
       int i = 0;
       int j=nums.length-1;
        while (i != j) {
            if (nums[i] == 0) {
                swap(nums, i);
                j--;
            } else {
                i++;
            }
        }

    }

    private static void swap(int[] nums, int i) {

        int tep = nums[i];

        for (int j = i + 1; j < nums.length; j++) {
            nums[j - 1] = nums[j];

        }
        nums[nums.length - 1] = tep;

    }
}
