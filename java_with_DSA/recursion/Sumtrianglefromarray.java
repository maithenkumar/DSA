package recursion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Sumtrianglefromarray
 */
public class Sumtrianglefromarray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sumtrianglefromarray2(arr);

    }

    public static void sumtrianglefromarray(int[] arr) {
        if (arr.length < 1) {
            return;

        }
        int[] tempArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {

            // tempArr=new int [arr.length];
            int temp = arr[i] + arr[i + 1];
            tempArr[i] = temp;
        }
        sumtrianglefromarray(tempArr);
        System.out.println(Arrays.toString(arr));
    }

    // without forLoop
    public static void sumtrianglefromarray2(int[] arr) {
        if (arr.length < 1) {
            return;

        }
        int[] tempArr = new int[arr.length - 1];
        helper(arr, tempArr, 0);
        // for (int i = 0; i < arr.length-1; i++) {

        // // tempArr=new int [arr.length];
        // int temp=arr[i]+arr[i+1];
        // tempArr[i]=temp;
        // }
        sumtrianglefromarray(tempArr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] helper(int[] arr, int[] temp, int index) {
        if (index == arr.length - 1) {
            return temp;

        }

        temp[index] = arr[index] + arr[index + 1];
        return helper(arr, temp, index + 1);

    }
}
