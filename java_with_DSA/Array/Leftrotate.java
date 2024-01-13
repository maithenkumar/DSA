package Array;

import java.util.Arrays;

public class Leftrotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println( Arrays.toString(leftIndRotWithD_Opt(arr,8)) );
        
    }
    //optmal 
    static int [] leftIndRotWithD_Opt(int arr[],int d){
        d=arr.length%d;
        rotate(arr, 0, d+1);
        // rotate(arr, d, arr.length-1);
        // rotate(arr, 0, arr.length-1);
return arr;
    }
    static int [] leftIndRotWithD(int arr[],int d){
        for (int i = 0; i < d%arr.length; i++) {
            int temp=arr[0];

            for (int index = 1; index < arr.length; index++) {
                arr[index-1]=arr[index];

            }
            arr[arr.length-1]=temp;
        
        }

        return arr;
    }
    static int [] rotate(int arr[],int left,int right){
        
        while (left<right){ 
            swap(arr,left,right);

            left++;
            right--;

            
        }
        return arr;
    }
    static int [] leftIndRotate(int arr[]){
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];

        }
        arr[arr.length-1]=temp;
        return arr;
    }
    private static void swap(int[] arr, int left, int right) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    
}
