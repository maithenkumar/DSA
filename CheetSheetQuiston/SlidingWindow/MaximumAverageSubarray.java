package SlidingWindow;

import String.demo;

/**
 * MaximumAverageSubarray
 */
public class MaximumAverageSubarray {

    public static void main(String[] args) {
        int[] arr={5};
        System.out.println("jckdsc");
        System.out.println(findMaxAverage2(arr, 1));
    }
    //another approch

    public static double findMaxAverage2(int[] nums, int k) {
        // int size=0;
        // for (int i = 0; i < k; i++) {
        //     size+=nums[i];
        // }
        // int max=size;
        // for (int i = k; i < nums.length; i++) {
        //     size += nums[i] - nums[i-k];
        //     max = Math.max(max,size);
        // }
        // return (double)max/k;
        int cur = 0;
        for(int j=0;j<k;j++){
            cur += nums[j];
        }
        int max = cur;
        for(int i=k;i<nums.length;i++){
            cur += nums[i] - nums[i-k];
            max = Math.max(max,cur);
        } 
        return (double)max/k;
        
    }public static double findMaxAverage(int[] nums, int k) {
        double max=(double)Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-k; i++) {
            int wins=0;
            for (int j = 0; j < k; j++) {
                wins+=nums[i+j];
                // if ((nums.length-i)+1<k) {
                //     // j=k;
                //     // i=nums.length;
                //     i=nums.length;
                //     break;
                // }
            }
            wins= (wins/k);
            if (max<wins) {
                max =(double)wins;
            }
        }
        return max;
    }
}