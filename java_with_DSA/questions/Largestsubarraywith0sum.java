package questions;

import java.util.Arrays;
import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions
public class Largestsubarraywith0sum {
    public static void main(String[] args) {
        int[] arr = { 2, -8, 6, 7, 10, 1, 2, 3, -6, 23 };
        System.out.println(maxLen2(arr, arr.length - 1));

    }

    static int maxLen3(int arr[], int n) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum==0){
                max = i+1;
            }
            if(map.containsKey(sum)){
            max=Math.max(max,i-map.get(sum));       
            }
            else{
                map.put(sum, i);
            }
        }
        return max;
    }

    static int maxLen2(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) { // {15,2232,2,-8,6,7,10,23};
                maxLen = i + 1;
            } else if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(Arrays.toString(arr));
        return maxLen;
    }

    static int maxLen(int arr[], int n) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {// int [] arr={-1 ,1 ,-1 ,1};
                sum += arr[j];
                count += 1;
                if (sum == 0) {
                    if (max < count) {
                        max = count;
                    }

                }

            }
            count = 0;

        }

        return max;
        // Your code here
    }
}
