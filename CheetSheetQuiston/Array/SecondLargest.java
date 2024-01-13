package Array;

/**
 * SecondLargest
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 43, 2, 2, 34 };
        System.out.println(print2largest(arr, arr.length));
    }

    static int print2largest1(int arr[], int n) {
        int left = 0;
        int right = n - 1;
        int larg = -1;
        int prv = -1;
        while (left <= right) {
            if (larg < arr[right]) {
                prv = larg;
                larg = arr[right];

            }
            if (arr[left] > larg) {
                larg=arr[left];
            } else if (arr[i] < larg && arr[i] > prv) {
                prv = arr[i];
            }
        }

    }

    static int print2largest(int arr[], int n) {
        // code here
        int larg = -1;
        int prv = -1;
        for (int i = 0; i < n; i++) {
            if (larg < arr[i]) {
                prv = larg;
                larg = arr[i];

            } else if (arr[i] < larg && arr[i] > prv) {
                prv = arr[i];
            }
        }
        return prv;
    }
}