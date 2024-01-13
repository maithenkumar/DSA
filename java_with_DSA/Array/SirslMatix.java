package Array;

public class SirslMatix {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        sirslMatix(arr);

    }

    static void sirslMatix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int top = 0, left = 0;
        int bottom = n - 1;
        int right = m - 1;
        while (left<=right &&top<=bottom) {
            
        
        for (int i = left; i <= right; i++) {
            System.out.println(arr[left][i]);

        }
        left++;
        for (int i = top; i <= bottom; i++) {
            System.out.println(arr[i][right]);

        }
        right--;
        for (int index = right; index >= top; index--) {
            System.out.println(arr[bottom][index]);

        }
        bottom--;
        for (int i = bottom; i > top; i--) {
            System.out.println(arr[i][top]);

        }
        top++

        ;

    }
}

}
