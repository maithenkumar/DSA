package CuriousFreaksCodingSheet.Array.java;

import java.util.Arrays;

public class Sortanarrayof0s1sand2s {
    //optimal 
    public static void sort0121(int a[], int n){
       
        // code here 
        int low = 0; // pointer for 0
        int high = n - 1; // pointer for 2
        int mid = 0; // pointer for 1
        
        while (mid <= high) {
            if (a[mid] == 0) {
                // Swap a[low] and a[mid]
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                // No need to swap, just move mid
                mid++;
            } else { // a[mid] == 2
                // Swap a[mid] and a[high]
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
                // Don't increment mid as the swapped element at mid might need further processing
            }
        }
    }
  
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
    }
}
