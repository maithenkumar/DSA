package questions;

import java.util.Arrays;
import java.util.HashMap;

import org.xml.sax.HandlerBase;

/**
 * MissingNumber
 */
public class MissingNumber { 

public static void main(String[] args) {
    int [] nums = {9,6,4,2,3,5,7,0,1};//1,0,3,4
    System.out.println(missingNumber3(nums));
}
//more optimal 

    public static int missingNumber3(int[] nums) {
    int sum=0;
    int n=nums.length;
    int sum1=n*(n+1)/2;
    for (int i = 0; i < nums.length; i++) {
        sum+=nums[i];
    }
    if (sum==sum1) {
        return nums.length;

    }else{
        return sum1-sum ;
    }

    }
        public static int missingNumber2(int[] nums) {
        HashMap hmp=new  HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            hmp.put(nums[index],index );

        }
        for (int index = 0; index < nums.length; index++) {
            if (!hmp.containsKey(index)) {
                return index;
            }
        }
    return nums.length;
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=index) {
                return index;
            }
        }
        return nums.length;

    }
}