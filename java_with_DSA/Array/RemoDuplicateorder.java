package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class RemoDuplicateorder {

    public static void main(String[] args) {
        int [] arr={1,1,1,1,2,2,3,3};
        remoDuplicateorder2(arr,9);
    }
static void remoDuplicateorder2(int[] arr,int n) {
    int  i=0;
    for (int j = 1; j < arr.length; j++) {
        if (arr[i]!=arr[j]) {
            i++;
            arr[i]=arr[j];
        }
    }
System.out.println(Arrays.toString(arr));}
    static void remoDuplicateorder(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;

            }
            else{
                ans.add(arr[i]);
            }

        }
        ans.add(arr[arr.length - 1]);
        System.out.println(ans);
    }

}
