//https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {

        System.out.println(generate(4));
    }

    public static ArrayList<Integer> nCr(int n, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        int res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
            list.add(res);

        }
        return list;
    }

    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        // printing the entire row n:
        for (int j = 0; j <= numRows; j++) {
            for (int c = 1; c <= j; c++) {

                ans.add(nCr(j - 1, c - 1));

            }
        }
        return ans;
    }

    public static int[][] pascalTriangle(int N) {
        int[][] arr = new int[N + 1][N + 1];
        int index = 0;
        for (int i = 1; i <= N; i++) {
            arr[index][0] = 1;
            for (int j = 2; j < N; j++) {

                // arr[]
            }
            arr[N - 1][N] = 1;

        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        return arr;
    }
}
