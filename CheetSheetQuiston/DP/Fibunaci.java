package DP;

public class Fibunaci {

    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[n + 1];
        System.out.println(fibunaci3(n));
    }

    // normal
    static int fibunaci2(int n) {
        if (n == 0) {
            return 0;

        }
        if (n == 1) {
            return 1;

        }
        return fibunaci2(n - 1) + fibunaci2(n - 2);

    }

    // DP  Top down approch
    static int fibunaci(int n, int[] arr) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (arr[n] != 0) {
            return arr[n];

        }
        return arr[n] = fibunaci(n - 1, arr) + fibunaci(n - 2, arr);

    }
//Dp down up Approch 
    static int fibunaci3(int n) {
        
        int [] arr=new  int[n+1];
        arr[1]=1;
        arr[0]=0;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
            
        }
        return arr[arr.length-1];
    }
    
}
