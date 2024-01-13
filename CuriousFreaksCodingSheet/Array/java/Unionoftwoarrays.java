package CuriousFreaksCodingSheet.Array.java;

import java.util.HashSet;
import java.util.Set;

public class Unionoftwoarrays {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> ans=new HashSet<>();
        //Your code here
        for (int  temp : a) {
            ans.add(temp);
        }
        for (int  temp : b) {
            ans.add(temp);
        }

        return ans.size();
    }
    public static void main(String[] args) {
        
    }
}
