package questions;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
/**
 * RemoveElement
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = { 0,1,2,2,3,0,4,2};
        System.out.println(removeElement1(arr, 2));

    }

    public static int removeElement1(int[] nums, int val) {
        int count=0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                if (nums[right] == val) {
                    nums[right] = -1;
                    right -= 1;
                }

                else {
                    swap(nums, left, right);
                    left+=1;
                }

            }else{
                left+=1;

            }
        }
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                count += 1;
            }
        }
        return count;
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                swap(nums, i, nums.length - 1);

            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}