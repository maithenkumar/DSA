package questions;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
       int arr[] ={1,2,3,4,5};     
        System.out.println(
            
                    minSubArrayLen(11, arr)
    
        )
            ;
    }
    public  static int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
            for (int i = 0; i < nums.length-1; i++) {
                int temp=0;
                int index=0;


                for (int j = i; j <=nums.length-1; j++) {
                    index+=1;
                    temp+=nums[j];
                    if (temp==target) {
                        System.out.println(temp);
                        if (min>index) {
                            min=index;

                        }
                       
                    }
                  

                    
                }
            }
           
return min==Integer.MAX_VALUE?0:min;

    }    
}
