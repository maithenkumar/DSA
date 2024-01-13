package CuriousFreaksCodingSheet.Array.java;

import java.util.Arrays;
import java.util.HashMap;

// https://www.geeksforgeeks.org/problems/key-pair5616/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class KeyPair {

    public static void main(String[] args) {
        
        int N = 6, X = 16;
        int Arr[] = {1, 4, 45, 6, 10, 8};
        System.out.println(hasArrayTwoCandidates2(Arr, N, X));
    }
    //OPTIMAL USING TWO POOINTER
    static boolean hasArrayTwoCandidates3(int arr[], int n, int x) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey((arr[i]-x))) {
                return true;
            }
        }
        return false;
    }
    static boolean hasArrayTwoCandidates2(int arr[], int n, int x) {
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        int temp=0;
        while (i<j) {
             temp=arr[i]+arr[j];
            if (temp==x) {
                return true;
            }
            else if (temp<x) {
                i++;
            }
            else if (temp>x) {
                j--;
            }
        }
return false;
    }
    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            int temp=arr[i];
            for (int j = 0; j < n; j++) {
                if (temp+arr[j]==x&&i!=j) {
                    return true;
                }
            }
        }
        return false;

    }
}
