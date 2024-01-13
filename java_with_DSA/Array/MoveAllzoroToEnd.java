package Array;

import java.util.Arrays;

public class MoveAllzoroToEnd {
    public static void main(String[] args) {
        int arr[] ={1,2,3,0,2,0,0,3};
        System.out.println(Arrays.toString(moveAllzoroToEndOpt(arr)));
    }
    //optmal
    static int [] moveAllzoroToEndOpt(int []arr){

        int j=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;


        for (int i = j+1; i < arr.length; i++) {
            if (arr[i]!=0) {
                sp(arr, j,i);
                j++;
            }
        }
        return arr;
    }
    
    
    private static void swap(int[] arr, int i) {
    int temp=i;
        while (arr[i] == 0) {
        i--;
    }
    
    sp(arr, i,temp);
    }
    
    private static void sp(int[] arr, int i, int j) {

        int tem=arr[i];
         arr[i]=arr[j];
         arr[j]=tem;

    }
    static  int [] moveAllzoroToEnd(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==0) {
                changepos(arr,i,arr.length);
                
            }
        }
        return arr;
    }

    private static void changepos(int[] arr, int i, int l) {
        int temp=arr[i];
        for (int j = i+1; j <l; j++) {
            arr[j-1]=arr[j];

            
        }
        arr[l-1]=temp;
    }
}
