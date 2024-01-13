package questions.hard;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int n = 4;
        long arr1[] = { 1, 3, 5, 8 };

        int m = 5;
        long arr2[] = { 0, 2, 6, 8, 9 };
        merge(arr1, arr2, n, m);
    }

    public static void merge(long arr1[], long arr2[], int n, int m) {
        // code here
        int left = n - 1;
        int right = 0;
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
