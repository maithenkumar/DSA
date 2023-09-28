package questions;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix2(matrix, 10));

    }

    // this is effectively way faster than pervies
    public static boolean searchMatrix2(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[row].length - 1;
        int right = 0;
        int left = col;
        while (right <= left&&row >=col) {
            int mid = left + (left - right) / 2;

            if (matrix[row][0] <= target && matrix[row][col] >= target) {
                if (matrix[row][mid] == target) {
                    return true;
                }
                if (matrix[row][mid] < target) {
                    right = mid + 1;

                }if (matrix[row][mid] >target) {
                    right = mid - 1;

                }
                
                

            }
            else{
                row+=1;
            }
        }
        return matrix[row][left]==target;

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix[i].length; index++) {
                if (matrix[i][index] == target) {
                    return true;

                }

            }

        }
        return false;
    }

}
