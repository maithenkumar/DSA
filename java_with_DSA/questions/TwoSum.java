package questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum3(arr, 13)));
    }
    static int [] twoSum3(int[] nums,int traget){
        HashMap<Integer,Integer> ans=new HashMap<>( );
        for (int i = 0; i < nums.length; i++) {
            int diff=traget-nums[i];
            if (ans.containsKey(diff)) {

                return new int []{ans.get(diff),i};
            }
            
            ans.put(nums[i], i);
        }
        return new int[]{};
    }
 
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[j] + nums[i] == target) {
                    return new int[] { j, i };

                }
            }
        }

        return new int[] {};
    }

}
