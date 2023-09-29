package questions;

import java.util.HashMap;
import java.util.Map;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] nums={1,1};
        
    System.out.println( containsDuplicate2(nums));
    }
 public static  boolean containsDuplicate(int [] nums){
    boolean ans=false;
    for(int i=0; i<nums.length;i++){
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i]==nums[j]) {
                ans=true;
                
            }
            
        }
    }
    return ans;

}
 public static  boolean containsDuplicate2(int [] nums){
    Map<Integer,Integer> temp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(temp.containsKey(nums[i])){
            return true;
        }
        else{
            temp.put(nums[i],i);
        }
    }

    return false;

 }

}
