package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        rotateArr(arr, 2, 5);
    }
    
    static void rotateArr(int arr[], int d, int n)
    {
        int [] a=new int[n];
        int j=0;

        d=d%n;
        System.out.println(d);
        for(int i=d; i<n; i++){
            a[j] = arr[i];
            j++;
         }
         for(int i=0; i<d; i++){
            a[j] = arr[i];
            j++;
         }
         for(int i=0; i<n; i++){
             arr[i] = a[i];
         }
        // for (int i = 0; i <d; i++) {
        //     int temp=arr[0];
        //     for (int j = 1; j < arr.length; j++) {
        //         arr[j-1]=arr[j];
        //     }
        //     arr[n-1]=temp;
        // }
        System.out.println(Arrays.toString(arr));
    }
}
