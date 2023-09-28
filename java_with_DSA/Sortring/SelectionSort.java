package Sortring;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={12,2,1,2,21,12,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
        
    }
    public static int [] selectionSort(int arr[]){
        for (int index = 0; index < arr.length-1; index++) {
            int min=index;
            for (int i = index; i < arr.length; i++) {
                if (arr[min]>arr[i]) {
                    min=i;                    
                }
            }
            swap(arr,index,min);
        }

        return arr;
    }
    public static void swap(int[] arr,int f,int min){
            int temp=arr[f];
            arr[f]=arr[min];
            arr[min]=temp;

            
    }
    
}
