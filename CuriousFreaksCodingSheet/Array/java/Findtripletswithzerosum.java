package CuriousFreaksCodingSheet.Array.java;

// https://www.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
public class Findtripletswithzerosum {
    public static void main(String[] args) {
    }

    public boolean findTriplets(int arr[], int n) { // add code here.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    if (arr[i] + arr[j] + arr[j2] == 0 && i != j && j2 != j && j2 != i) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
