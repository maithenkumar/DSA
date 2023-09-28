package Array;

import java.util.Arrays;

public class SecondLargestInArr {
    public static void main(String[] args) {
                int[] arr = { 75, 2, 5, 52, 3, 5, 7, 8, 75, 4, 45 };
                secondLargestInArr(arr);
                Arrays.sort(arr);

    }
    static void secondLargestInArr(int arr[]){
        int larget=arr[0];
        int prv=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (larget<arr[i]) {
              prv=larget;
                larget=arr[i];
            }
            else if(arr[i]<larget&&arr[i]>prv){
                prv=arr[i];

            }
        }
System.out.println(prv);
    }
}
