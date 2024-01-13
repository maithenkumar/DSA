package Array;

import java.util.Arrays;

public class DetchNationalFlagAlgo {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,2,0,1,1,2,1,2,2};
        System.out.println(Arrays.toString(ssortWith012(arr)));

    }

    // sort like {0,0,0,1,1,1,2,2}
    // this is very optimal
    // detech national flag Algorithm
    static int[] ssortWith012(int[] arr) {
            int low=0;
            int mid=0;
            int high=arr.length-1;
            while (mid<=high) {
                if (arr[mid]==0) {
                    swap(arr, mid, low);
                    low++;
                    mid++;
                }
                else if(arr[mid]==1)
                   {  mid++;}
                 else if(arr[mid]==2)
                {
                    swap(arr, mid, high);
                    high--;
                }


    }
     return arr;
    }
    static void swap(int arr[], int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
   

}

