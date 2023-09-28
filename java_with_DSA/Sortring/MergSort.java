package Sortring;

import java.util.ArrayList;
import java.util.Arrays;

public class MergSort {
    public static void main(String[] args) {
        int[] arr = { 2323, 23, 32, 32, 23, 3 };
        System.out.println(Arrays.toString(mergsort(arr, 0, arr.length - 1)));
    }

    static int[] mergsort(int arr[], int low, int high) {
        if (high == low) {
            return new int []{arr[low]};
        }
        int mid = (low + high) / 2;
        mergsort(arr, low, mid);
        mergsort(arr, mid + 1, high);
        merge(arr, low, mid, high);
        return arr;

    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int rigth = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && rigth <= high) {
            if (arr[left] <= arr[rigth]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[rigth]);
                rigth++;
            }

        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;

        }
        while (rigth <= mid) {
            temp.add(arr[rigth]);
            rigth++;

        }
        for (int index = low; index < high; index++) {
            arr[index]=temp.get(index-low);
        }
    }
}