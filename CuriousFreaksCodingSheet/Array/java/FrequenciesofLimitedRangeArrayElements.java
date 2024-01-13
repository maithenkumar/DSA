package CuriousFreaksCodingSheet.Array.java;

import java.util.Arrays;
import java.util.HashMap;

/**
 * FrequenciesofLimitedRangeArrayElements
 */
public class FrequenciesofLimitedRangeArrayElements {
    public static void main(String[] args) {
     int    arr[] = {2, 3, 2, 3, 5};
     frequencyCount(arr, 5, 5);
     System.out.println(Arrays.toString(arr));
    }

    public static void frequencyCount(int arr[], int N, int P)
    {
    HashMap<Integer, Integer>map=new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        if (map.containsKey(arr[i])) {
            map.put(arr[i], map.get(arr[i])+1);
        }else{
            map.put(arr[i],1);
        }
    }
    for (int i = 1; i <=arr.length; i++) {
        if (map.containsKey(i)) {
            arr[i-1]=map.get(i);
        }else{
            map.put(i, 0);
            arr[i-1]=map.get(i);

        }
    } 
        // code here
    
    }
}