package CuriousFreaksCodingSheet.Array.java;
// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
public class Findminimumandmaximum {
    public static void main(String[] args) {
        long [] arr = {1, 345, 234, 21, 56789};
        getMinMax(arr,arr.length );
    }

    static void getMinMax(long a[], long n)

    {
        long min = a[0];
        long max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];

            }
            if (min >a[i] && max > a[i]) {
                min = a[i];
            }
        }
        System.out.println("min :"+min);
        System.out.println("max :" +max);

        // Write your code here
    }
}
