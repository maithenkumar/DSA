package questions;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] nums={1,2,3,};
        
    System.out.println( containsDuplicate(nums));
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
}
