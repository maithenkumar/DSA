package questions;

public class JumpGame {
    public static void main(String[] args) {
        int [] arr={3,2,1,0,4};
        System.out.println(canJump(arr));

    }

    public static boolean canJump(int[] nums) {
       int reachable = 0;
    for (int i=0; i<nums.length; ++i) {
        if (i > reachable) return false;  
        reachable = Math.max(reachable, i + nums[i]);
    }
    return true;
 } public static int  canJump2(int[] nums) {
int count=0;
       int reachable = 0;
    for (int i=0; i<nums.length; ++i) {
        count +=1;
        if (i > reachable) return 0;  
        reachable = Math.max(reachable, i + nums[i]);
    }
    return count;
}}
