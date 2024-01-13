package CuriousFreaksCodingSheet.Array.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
      int [] arr={1,0,-1,0,-2,2};
      System.out.println(fourSum(arr, 0));
        
    }
      public static  List<List<Integer>> fourSum(int[] nums, int target) {
        
        // List<List<Integer>>ans=new HashSet();
        // HashSet<HashSet<Integer>> ans=new HashSet<>();
        Set<ArrayList<Integer>>ans=new HashSet<Integer>();
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
           
            for (int index = i+1; index < nums.length; index++) {
            int k=index+1;
            int l=nums.length-1;
              while (k<l) {
                int temp=nums[i]+nums[k]+nums[l]+nums[index];
                if (temp==target) {
                  // HashSet<Integer>tempans=new HashSet<>();
                  ArrayList<Integer>tempans=new ArrayList<>();
                  tempans.add(nums[i]);
                  tempans.add(nums[index]);
                  tempans.add(nums[l]);
                  tempans.add(nums[k]);
                  ans.add(tempans);break;

                  
                }
                else if(temp>target){
                  l--;

                }
                else if(temp<target){
                  k++;
                }
              }
          }
        }
    return ans;
      }
}
