package CuriousFreaksCodingSheet.Array.java;
//https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

import java.util.Arrays;

/**
 * TripletSuminArray
 */
public class TripletSuminArray {

    public static void main(String[] args) {
        int n = 6, X = 13;

        int arr[] = { 1, 4, 4, 5, 6, 10, 8 };
        System.out.println(find3Numbers2(arr, n, X));

    }

    public static boolean find3Numbers2(int A[], int n, int X) {

        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            int j=i+1;
            int k=n-1;
         
            while (j<k) {
                if (A[i]+A[j]+A[k]==X) {
                    return true;
                }

                else if (A[i]+A[j]+A[k]>X) {
                    j++;
                }
                else if (A[i]+A[j]+A[k]<X) {
                    k--;
                }
            }


        }
        return false;
    }

    public static boolean find3Numbers(int A[], int n, int X) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                for (int z = 0; z < A.length; z++) {
                    int temp = A[i] + A[j] + A[z];
                    if (temp == X && i != j && j != z && z != i) {
                        return true;
                    }
                }
            }
        }
        // Your code Here
        return false;
    }
}