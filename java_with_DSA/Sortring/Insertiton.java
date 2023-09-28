package Sortring;

import java.util.Arrays;

public class Insertiton {
    public static void main(String[] args) {
        int []arr={1,2,2,3,7,4,55,5,5};
        System.out.println(Arrays.toString(insertitonSort(arr)));
        
    }
    static int [] insertitonSort(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            
            while (i>0&& arr[i]>arr[i+1]) {
                
                swap(arr,i,i+1);
                i--;
                
            }
        }
        return arr;
    }
    static void  swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;

    }
}
