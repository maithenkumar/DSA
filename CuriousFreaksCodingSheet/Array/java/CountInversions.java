package CuriousFreaksCodingSheet.Array.java;

public class CountInversions {
    public static void main(String[] args) {
        long N = 5;
        long arr[] = { 2, 3, 4, 5, 6 };
        System.out.println(inversionCount(arr, N));
    }

    static long inversionCount(long arr[], long N) {
        long inver = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    inver++;
                }
            }
        }
        // Your Code Here
        return inver;
    }

}
