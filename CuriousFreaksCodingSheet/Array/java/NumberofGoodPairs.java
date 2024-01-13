package CuriousFreaksCodingSheet.Array.java;

import java.util.HashMap;

/**
 * NumberofGoodPairs
 */
public class NumberofGoodPairs {

    public static void main(String[] args) {

    }

    public int numIdenticalPairs2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index])) {
                map.put(nums[index], map.get(nums[index]) + 1);
            } else {
                map.put(nums[index], 1);

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.get(nums[i])>1) {
                    count+=con(map.get(nums[i]));
                    map.remove(nums[i]);
                }
            }
        }
        return count;
    }

    private static  int con(Integer integer) {
        int count=0;
        for (int i = 2; i <=integer; i++) {
            count+=i-1;
        }
        return count;
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}