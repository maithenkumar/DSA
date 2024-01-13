package Array;

public class KadensAlgo {
    public static void main(String[] args) {
        int arr[] = { 1, 1 ,2, -1, 4, 3, };
        System.out.println(findLargestSubArray(arr));

    }

    static int findLargestSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            max += arr[i];

            if (max < 0) {
                max = 0;
            }
        }
        return max;
    }
}
