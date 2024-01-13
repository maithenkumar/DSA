package Array;

import java.util.Arrays;
import java.util.HashMap;

import Array.Findminimumandmaximum.Pair;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        
        int []nums = {1,3,5,-1,4};
        System.out.println(longestConsecutive2(nums));
       } 
         public  static int longestConsecutive2(int[] nums) {
             HashMap<Integer, Pair<Integer, Integer>> mp = new HashMap<>();
        HashMap<Integer, Boolean> bl = new HashMap<>();
        int mx = 0;

        for (int i : nums) {
            if (bl.containsKey(i)) {
                continue;
            }
            bl.put(i, true);
            int l = i, r = i;

            if (mp.containsKey(i + 1)) {
                r = mp.get(i + 1).getKey();
            }
            if (mp.containsKey(i - 1)) {
                l = mp.get(i - 1).getValue();
            }
            mp.put(r, new Pair<>(r, l));
            mp.put(l, new Pair<>(r, l));
            mx = Math.max(mx, r - l + 1);
        }

        return mx;
    }

         }
         public  static int longestConsecutive(int[] nums) {
            Arrays.sort(nums);
            HashMap<Integer,Integer> hMap=new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!hMap.containsKey(nums[i])) {
                    hMap.put(nums[i], nums[i]);

                }
            }
            int count=0;
            int ans=0;
            System.out.println(hMap);
            for (int i =  -nums.length; i <= nums.length; i++) {
                if (hMap.containsKey(hMap.get(i))) {
                    count++;
                    ans=Math.max(count,ans) ;
                  }else{
                   ans=Math.max(count,ans) ;
                    count=0;
                }
            }
            
            return ans;
    }
}