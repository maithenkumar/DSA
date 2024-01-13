package CuriousFreaksCodingSheet.Array.java;

public class RemoveduplicateelementsfromsortedArray {
    public static void main(String[] args) {
        int N = 4;
        int[] Array = { 1, 2, 2, 4 };
        System.out.println(remove_duplicate(Array, N));
    }

    static int remove_duplicate(int A[], int N) {
        int i = 0;
        int j = i + 1;

        while (i < A.length || j < A.length) {
            if (A[j] == 0)
                return i;
            if (A[i] == A[j]) {
                swap(A, i, j);
            } else {
                i++;
                j++;
            }
        }
        // code here
        return i;

    }

    private static void swap(int[] a, int i, int j) {

        while (i < a.length - 1) {
            a[i] = a[i + 1];
            i++;

        }
        a[a.length - 1] = 0;
    }
}
