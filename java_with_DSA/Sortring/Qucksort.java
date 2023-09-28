package Sortring;

import java.util.Arrays;

public class Qucksort {
    public static void main(String[] args) {
                int[] arr = { 2, 2, 5, 52, 3, 5, 7, 8, 75, 4, 45 };

                System.out.println(Arrays.toString(qs(arr, 0, arr.length-1)));
    }

    static int[] qs(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            partition(arr, low, pIndex);
            partition(arr, pIndex + 1, high);

        }
        return arr;

    }

    private static int partition(int[] arr, int low, int high) {
        int pivet = low;
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivet && i <= high - 1) {
                i++;

            }
            while (arr[j] > pivet && j >= low + 1) {
                j--;

            }
            if (i < j) {
                // swap(arr[i], arr[j]);
                swap(i, j,arr);

            }

        }
        swap(low, j,arr);
        return j;

    }

    static void swap(int i,int j,int []arr) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
