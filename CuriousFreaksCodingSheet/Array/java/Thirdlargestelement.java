package CuriousFreaksCodingSheet.Array.java;
//https://practice.geeksforgeeks.org/problems/third-largest-element/1
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Thirdlargestelement
 */
public class Thirdlargestelement {

    public static void main(String[] args) {
        int [] arr = {1, 345, 234, 21, 56789};
        System.out.println(thirdLargest(arr, 0));
        
    }
    static int thirdLargest2(int a[], int n){
        long min = a[0];
        long max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];

            }
            if (min >a[i] && max > a[i]) {
                min = a[i];
            }
        }

        // Write your code here

    }
    static int thirdLargest(int a[], int n)
    {
	    // Your code here
	    Arrays.sort(a);
	    return a[a.length-3];
    }
}