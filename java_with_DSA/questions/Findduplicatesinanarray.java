package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Findduplicatesinanarray
 */
public class Findduplicatesinanarray {

    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 2, 3 };
        System.out.println(duplicates2(a, a.length - 1));

    }

    public static ArrayList<Integer> duplicates2(int arr[], int n) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int dup = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && dup != arr[i]) {
                ans.add(arr[i]);
                dup = arr[i];

            }

        }
        if (ans.size() == 0) {
            ans.add(-1);
        }
        return ans;
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> temp = new HashMap<>();
        int dup = -1;
        for (int i = 0; i < arr.length; i++) {
            if (temp.containsKey(arr[i]) && dup != arr[i]) {
                dup = arr[i];
                ans.add(arr[i]);

            } else {
                temp.put(arr[i], i);
            }

        }

        return ans;
    }

}