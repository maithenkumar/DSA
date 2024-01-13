package questions;

import java.util.Vector;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    public static  int climbStairs(int n) {
        int count=0;
        
        backtrack(0, n,count);
        System.out.println(count);
        return 0;
    }
    static int backtrack(int  num,int max,int count){
        if (num==max) {
           return count+=1;
        }
        if (num>max) {
            return 0;
        }
        if (num<max) {
            backtrack(num+1, max ,count) ;
        }
        if (num<max) {
            backtrack(num+2, max,count);
        }
        return 0;
    }
}
