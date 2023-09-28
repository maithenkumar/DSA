package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        char c = 5;
        System.out.println(binarysearchInRecursion(arr, c, 0, arr.length));

    }

    static int binarysearchInRecursion(int[] arr, char c, int first, int last) {

        if (last<first) {
            return -1;
            
            
        }
        int mid = first + (last - first) / 2;
        if (arr[mid] == c) {
            return mid;
        }
        if (arr[mid] < c) {
            first = mid + 1;
            return   binarysearchInRecursion(arr, c, first, last);

        }
        if (arr[mid] > c) {
            last = mid - 1;
            return   binarysearchInRecursion(arr, c, first, last);
        }
        

        return -1;
    }

    static void swap(int arr, int first, int last, int mid) {

    }
}
