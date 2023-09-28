package Array;

public class LargestElmentInArr {

    public static void main(String[] args) {
        int[] arr = { 2, 2, 5, 52, 3, 5, 7, 8, 75, 4, 45 };
        largestElmentInArr(arr);

    }

    static void largestElmentInArr(int arr[]) {
        int larget = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (larget < arr[i]) {
                larget = arr[i];
            }

        }
        System.out.println(larget);
    }
}
