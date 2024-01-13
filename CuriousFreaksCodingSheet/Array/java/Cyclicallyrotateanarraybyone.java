package CuriousFreaksCodingSheet.Array.java;
// https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class Cyclicallyrotateanarraybyone {

    public void rotate(int arr[], int n) {
         swap(arr, n);
    }

    static void swap(int[] arr, int n) {
        int temp = arr[n-1];
        for (int i = n-1; i > 0; i--) {
             arr[i]=arr[i-1];
        }
        arr[0]=temp;

    }
}
