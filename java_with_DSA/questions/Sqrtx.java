package questions;

import java.util.ArrayList;
import java.util.List;

public class Sqrtx {
    public static void main(String[] args) {
        
        System.out.println(mySqrt(10));

    }
    public static int mySqrt(int number) {
        List<Integer> list = new ArrayList<Integer>();
        int  t;
        int  squareroot = number / 2;
        do 
        {
        t = squareroot;
        squareroot = (t + (number / t)) / 2;
        }
         while ((t - squareroot) != 0);
        return squareroot;
        }

}