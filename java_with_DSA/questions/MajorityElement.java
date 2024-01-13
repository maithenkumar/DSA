package questions;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr={3};
        System.out.println(majorityElement(arr));

    }
    public static  int majorityElement(int[] nums) {
        int max=0;
        int count=0;
      
        for (int i:nums) {
            if(count==0){
                max=i; 
            }
            if (max==i) {
                count++;
                
            }
            else {
                
                count--;
            }
            
            
        }
        return max;
    }
    
}
