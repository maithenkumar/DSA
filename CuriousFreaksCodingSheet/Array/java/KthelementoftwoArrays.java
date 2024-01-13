package CuriousFreaksCodingSheet.Array.java;

import java.util.Arrays;

public class KthelementoftwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 4, 4, 6, 7, 9 };
        int arr2[] = { 4, 4, 4,7,8, 9 };
        int k = 5;
        System.out.println(kthElement(arr1, arr2, arr1.length, arr2.length, k));

    }

    public static long kthElement2(int arr1[], int arr2[], int n, int m, int k) {
        int temp=0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i; j < arr2.length; j++) {
                temp+=
            }
        }
    }public static long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int[] ans = new int[n + m];
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans[index++] = arr1[i];
                i++;

            }
           else if (arr1[i] >= arr2[j]) {
                ans[index++] = arr2[j];
                j++;
            } else {
                i++;
                j++;
            }
        }
        while(i<n){
        ans[index++] = arr1[i];
        i++;
        }
        while(j<m){
            ans[index++] = arr2[j];
            j++;
        }
        System.out.println(Arrays.toString(ans));
        return ans[k];
    }

}
