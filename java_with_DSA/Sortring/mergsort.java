package Sortring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergsort {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 5, 52, 3, 5, 7, 8, 75, 4, 45 };

        System.out.println((MergSort(arr, 0, arr.length - 1)));
    }

    static int[]   MergSort(int[] arr, int low, int high) {
        if (low >= high) {
            return   new int []{};

        }
        int mid = (low + high) / 2;
        MergSort(arr, low, mid);
        MergSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
        return arr;
    }

    public static void  merge(int[] arr, int low, int mid, int high) {
        int left=low;
        int right=mid+1;

        List<Integer> temp = new ArrayList<>();
        while (right <=high && left >= mid) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;

            }
            else  {
                temp.add(arr[right]);
                right++;

            }
           
        }
         while (left<=mid) {
                temp.add(arr[left]);
                left++;
                
            }

            while (right<=mid) {
                temp.add(arr[high]);
                right++;
            }
            for (int i=low; i<=high; i++) {
                arr[i] = temp.get(i-low);
            }

    }
}
