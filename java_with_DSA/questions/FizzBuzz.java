package questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        String na=1+"";
        
        System.out.println((na));
        System.out.println(fizzBuzz(5));


    }

    public static  List<String> fizzBuzz(int n) {
        List<String> ans = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");

            } else if (i % 5 == 0) {
                ans.add("Buzz");

            }
            else{
                ans.add(i+"");

            }
        }
        return ans;
    }
}
