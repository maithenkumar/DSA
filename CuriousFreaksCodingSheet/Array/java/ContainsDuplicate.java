package CuriousFreaksCodingSheet.Array.java;

import java.util.HashMap;

// https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate {

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashMap <Integer,Integer >map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i-map.get(nums[i])<=k) {
                    return true;
                }
                map.put(nums[i], i);
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
        
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i - j <= k) {
                    return true;
                }
            }
        }
        return false;
    }

}
