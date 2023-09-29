package questions;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
       int  arr[] =  {2,4,7,8,9,10};
       convertToWave(arr.length-1, arr);

    }

    public static void convertToWave(int n, int[] a) {
        int index = 0;
        while (index < n) {
            if (a[index] <= a[index + 1]) {
                swap(a, index, index + 1);
                index+=2;
            }
            else {
                index+=2;

            }

        }
        System.out.println(Arrays.toString(a));
    }

    private static void swap(int[] a, int index, int i) {
        int temp = a[index];
        a[index] = a[index + 1];
        a[index + 1] = temp;
    }
}
