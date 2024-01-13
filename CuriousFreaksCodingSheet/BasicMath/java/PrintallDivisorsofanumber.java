package CuriousFreaksCodingSheet.BasicMath.java;

import java.util.ArrayList;
import java.util.List;

//https://www.codingninjas.com/studio/problems/print-all-divisors-of-a-number_1164188
public class PrintallDivisorsofanumber {
    public static void main(String[] args) {
        System.out.println(printDivisors(29 ));
        
    }
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List< Integer > ans=new ArrayList<Integer>();
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0) {
                ans.add(i);
            }
        }

        ans.add(n);
        return ans ;
}
}
