package questions;

import java.util.Arrays;

public class  RemoveDuplicatesfromSortedArray2 {
    public static void main(String[] args) {
        int []arr={0,0,1,1,1,1,2,3,3};
        
        System.out.println(removeDuplicates(arr));
    }
    public static  int removeDuplicates(int[] nums) {
          int count=0;
        int prv=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i+=2) {
            if(nums[i]==prv){ 
                nums[i]=-1;
                if (i==nums.length-2) {
                    
                    if(nums[i+1]==prv){
                        nums[i+1]=-1;
                        }
                }
            }else{
                prv=nums[i];
            }


        }
        int left=0;
        int right=nums.length-1;
        while (left<right) {
          int temp=nums[left];
            if(temp==-1){
                for (int j = left+1; j < nums.length; j++) {
                    nums[j-1]=nums[j];

                    
            }
            nums[nums.length-1]=temp;
            right--;
            }  
            if (temp!=-1) {
                left++;
            } 
        }
     
      
        for (int i = 0; i < nums.length; i++) {
           if( nums[i]!=-1){
            count+=1;
           }
        }
        System.out.println(Arrays.toString(nums));
            return count;
    }
}
