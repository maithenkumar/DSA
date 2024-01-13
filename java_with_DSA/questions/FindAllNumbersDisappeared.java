package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class  FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int  []nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers2(nums));
    }
     public static  List<Integer> findDisappearedNumbers3(int[] nums) {

     }
     public static  List<Integer> findDisappearedNumbers2(int[] nums) {
         List<Integer> list = new ArrayList<>();
         for (int i = 1; i <= nums.length; i++) {
            if (lenearSearch(nums, i)==false) {
                list.add(i);
            }
           
         }
         
         return list;

     }
     static boolean lenearSearch(int []nums,int i){
 for (int j = 0; j < nums.length; j++) {
                if (i==nums[j]) {
                    
                    return true;
                }                
            }
            return false;

     }
     public static  List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hMap.put( nums[i],i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!hMap.containsKey(i)) {
                list.add(i);
            }
        }
        return list;

        
        
    }
    
}
