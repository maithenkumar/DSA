package CuriousFreaksCodingSheet.Array.java;

import java.util.Arrays;

public class SquaresofaSortedArray {
    
    public int[] sortedSquares(int[] nums) {
     for (int i = 0; i < nums.length; i++) {
        nums[i]=(int )Math.pow(nums[i], 2);
     }   
      Arrays.sort(nums);
    return nums;
    }
    static void sort(int [] arr){
        int i=0;
        int j=arr.length-1;

        while (i<j) {
            if (arr[i]==arr[j]) {
                
            }
        }
    }
}
