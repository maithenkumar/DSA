package questions;
//https://leetcode.com/problems/single-number/

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        // int[] arr = { 1, 1, 2, 2, 4 };
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hMap.containsKey(nums[i])) {
                hMap.put(nums[i], hMap.get(nums[i]) + 1);
            } else {
                hMap.put(nums[i], 0);
            }
        }
        for (int i : hMap.keySet()) {
            if (hMap.get(nums[i])==0) {
                    return nums[i];
            }
        }
        return 0;
    }
}