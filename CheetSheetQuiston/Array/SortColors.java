package Array;

import java.util.Arrays;

/**
 * SortColors
 */
public class SortColors {

    
    public static void main(String[] args) {
        int  []nums = {2,0,2,1,1,0};
        sortColors2(nums);

        
    }

    public  static void sortColors2(int[] nums) {
    int left=0;
    int right=nums.length-1;
    while (left<right) {
        if (nums[left]>nums[right]) {
            swap(nums, left, right);
            right--;
        }
        else{
            left++;
        }
        
    }       

    }//normal solution
    public  static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]>nums[j+1]) {
                    swap(nums,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int j, int i) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    } 
}