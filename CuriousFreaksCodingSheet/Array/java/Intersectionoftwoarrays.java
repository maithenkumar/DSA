package CuriousFreaksCodingSheet.Array.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Intersectionoftwoarrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        Set<Integer> ans1=new HashSet<>();

    // HashMap<Integer,Integer> ans=new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      
            ans1.add(a[i]);
        
    }for (int i = 0; i < b.length; i++) {
        if (ans1.contains(b[i])) {
            count++;
        }
    }


        // Your code here
        return count;
    }
    public static void main(String[] args) {
        
    }
}
