package Array;

import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        Long []arr={1l,2L,3L,4L,5L,6L};
        rearrange(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void rearrange(Long arr[], int n){
        
        for (int i = 0; i < n; i=i+2) {
            reverse(arr, i, n-1);
            
        }
        
    }
    static void reverse(Long []arr,int first,int end){
        Long temp=arr[end];
        for (int i = end; i >first; i--) {
            arr[i]=arr[i-1];
        }
        arr[first]=temp;
    }
}
