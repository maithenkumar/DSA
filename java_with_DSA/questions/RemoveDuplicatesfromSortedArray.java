package questions;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int []arr={0,0,1,1,1,1,2,3,3};
        
        System.out.println(removeDuplicates3(arr));
    }

    public static  int removeDuplicates3(int[] nums) {
        int i = 0, j= 0 , n = nums.length, state = 0 ;

        while(j<n) {
            if(state==0) {
                if(j<n-1 && nums[j]==nums[j+1]) {
                    state = 1;
                    nums[i] = nums[j];
                    nums[i+1] = nums[j] ;
                    i += 2;
                    j += 2;
                }
                else {
                    nums[i] = nums[j];
                    i++;
                    j++;
                }
            }
            else {
                if(nums[j]==nums[j-1]) {
                    j++;
                }
                else {
                    if(j<n-1 && nums[j]==nums[j+1]) {
                        nums[i] = nums[j] ;
                        nums[i+1] = nums[j] ;
                        i += 2;
                        j += 2;
                        state = 1;
                    }
                    else {
                        nums[i] = nums[j] ;
                        i++;
                        j++;
                    }
                }
            }
        }

        return i;
    }
        public static  int removeDuplicates2(int[] nums) {
            int count=0;
            int ans=0;
            int prv=nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (prv==nums[i]) {
                    count+=1;
                    
                    if (count>=2) {
                        nums[i]=-1;
                    }
                }else{
                    prv=nums[i];
                    count=0;
                }

                
           }
        System.out.println(Arrays.toString(nums));
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
        }  for (int i = 0; i < nums.length; i++) {
           if( nums[i]!=-1){
            ans+=1;
           }
        }
        return  ans;
    }
        public static  int removeDuplicates(int[] nums) {
        int count=0;
        int prv=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==prv){ 
                nums[i]=-1;
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
        // for (int i = 0; i < nums.length-1; i++) {
            
        //     int temp=nums[i];
        //     if(temp==-1){
        //         for (int j = i+1; j < nums.length; j++) {
        //             nums[j-1]=nums[j];

                    
        //     }
        //     nums[nums.length-1]=temp;
        //     }
        // }
      
        for (int i = 0; i < nums.length; i++) {
           if( nums[i]!=-1){
            count+=1;
           }
        }
        System.out.println(Arrays.toString(nums));
            return count;
    }
}
