package CuriousFreaksCodingSheet.Array.java;
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm- 1587115620/1 
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int N = 5;
        int Arr[] = { 1, 2, 3, -2, 5};
        System.out.println(maxSubarraySum(Arr, N));
    }

    static long maxSubarraySum(int arr[], int n) {
        long ans = Integer.MIN_VALUE;
        // Your code here
        int tol = 0;
        for (int i = 0; i < arr.length; i++) {
            tol += arr[i];
            ans = Math.max(ans, tol);
        //     if (tol < 0) {
        //        tol = 0;
        //    }
           
        }
        return ans;
    }
}
