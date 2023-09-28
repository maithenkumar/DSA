package Sortring;

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 121, 3, 1, 12, 1, 2 };
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }

    public static int[] bubbleSort(int[] arr) {
        for (int j = arr.length-1; j>=0; j--) {
            int did =0;
            
            for (int i = 0; i < j; i++) {

                if (arr[i] > arr[i + 1]) {
                    did++;
                    swap(arr, i, i + 1);
                }
            }
            if (did==0) {
            return arr;
                
            }

        }
        return arr;
    }

    static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
