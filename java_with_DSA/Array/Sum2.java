package Array;

import java.util.Arrays;

/**
 * Sum2
 */
public class Sum2 {

    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.println(Arrays.toString(sum2(arr, 1)));
    }
    static int[] sum2(int arr[],int trg){
        int left=0;
        int right=arr.length-1;
        while (right>=left) {
            int temp=arr[left]+arr[right];
            if (temp==trg) {
                return new int[]{arr[left],arr[right]};  
                
            }
            if (temp<trg){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
}