package recursion;

import java.util.Arrays;

public class Maximumelementsofarray {
    public static void main(String[] args) {
        int [] arr={1,2,32,1,-1};
        maximumelementsofarray(arr);
    }
    public static void  maximumelementsofarray(int[]arr){
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

    }
      public static void  maximumelementsofarray2(int[]arr){
        // Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

    }
    
}
