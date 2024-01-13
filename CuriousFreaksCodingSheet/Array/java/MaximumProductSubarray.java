package CuriousFreaksCodingSheet.Array.java;

public class MaximumProductSubarray {
    
    long maxProduct(int[] arr, int n) {
        // code here
        int ans =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int temp=0;
            for (int j = i+1; j < arr.length; j++) {
                temp+=arr[j]*arr[i];
                ans=Math.max(ans, temp);
            }
        }
        return ans;
    }
}
