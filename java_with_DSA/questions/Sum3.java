package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int [] nums={-1,0,1,2,-1,-4,1,4,-5};
        System.out.println(sum3(nums));
        
    }
    public static List<List<Integer>> sum3(int []nums){
    List<List<Integer>> ans=new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length-2; j++) {
            if (nums[i]+nums[j]+nums[j+1] ==0&&i!=j) {
                    List<Integer> temp=new ArrayList<>(3);
                    temp.add( nums[i] );
                    temp.add( nums[j] );
                    temp.add( nums[j+1] );
                    ans.add( temp);
                }

        }
        
    }
    return ans;
        
    }
    
}
