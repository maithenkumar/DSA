package CuriousFreaksCodingSheet.Array.java;

import java.util.Arrays;
import java.util.HashMap;

/**
 * ArraySubsetofanotherarray
 */
public class ArraySubsetofanotherarray {
    public static void main(String[] args) {
        long a1[] = { 8, 4, 5, 3, 1, 7, 9 };// {11, 7, 1, 13, 21, 3, 7, 3};
        long a2[] = { 5, 1, 3, 7, 9 };// {11, 3, 7, 1, 4};
        System.out.println(isSubset3(a1, a2, 0, 0));
    }

    public static String isSubset3(long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer>map=new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            if (map.containsKey(a1[i])) {
                map.put(a1[i],map.get(a1[i])+1);
            }else{
                map.put(a1[i], 1);
            }
        }
        for (int i = 0; i < a2.length; i++) {
             if (map.containsKey(a1[i])) {
                if(map.get(a2[i]) ==0) {
                    return "No";
                }else{

                map.put(a2[i],map.get(a2[i])-1);
                }
            }else{
               return "No";
            }
        }
        return "Yes";
    }
    public static String isSubset2(long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        for (int i = 0; i < m; i++) {
            if (a1[i] != a2[i]) {
                return "No";
            }
        }
        return "yes";
    }

    public static String isSubset(long a1[], long a2[], long n, long m) {
        boolean isher = false;
        for (int i = 0; i < a2.length; i++) {
            long temp = a2[i];
            for (int j = 0; j < a1.length; j++) {
                if (temp == a1[j]) {
                    isher = true;
                    break;
                }
            }
            if (isher == false) {
                return "No";
            }
            isher = false;
        }
        return "yes";
    }
}