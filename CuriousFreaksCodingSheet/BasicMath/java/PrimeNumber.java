package CuriousFreaksCodingSheet.BasicMath.java;

//https://practice.geeksforgeeks.org/problems/prime-number2314/1
public class PrimeNumber {
    public static void main(String[] args) {
        // System.out.println( isPrime(1));
        System.out.println( Math.sqrt(11));


    }

    static int isPrime(int N) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                count++;
            }
            if (count > 1) {
                return 0;
            }

        }
        return 1;
        // code here
    }
}
