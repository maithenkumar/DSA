package questions;

public class KadaneSAlgorithm {
    public static void main(String[] args) {
        int Arr[] = {1,2,3,-2,5};
        System.out.println(maxSubarraySum2(Arr, Arr.length-1));
    }
    static  long maxSubarraySum2(int arr[], int n){
        
        long  sum=0;
        long maxi=arr[0];
        
        for(int i=0;i<n;i++){
            sum=sum+arr[i];             //calculate the sum 
            maxi=Math.max(maxi,sum);    // set maximum sum as maxi
            if(sum<0){                  // if sum is negative then set as sum =0
                sum=0;
            }
        }
        
        return maxi;    // return maximum sum as a result 
    }
   static long maxSubarraySum(int arr[], int n){
    int max=Integer.MIN_VALUE;
    int temp=arr[0];
    for (int i = 1; i < n; i++) {
        temp+=arr[i];
        max=Math.max(max, temp);
        if (temp<0) {
            temp=-1;
        }
    }
        return max;
    }
    
}
