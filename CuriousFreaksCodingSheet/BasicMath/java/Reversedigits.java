package CuriousFreaksCodingSheet.BasicMath.java;
//https://www.geeksforgeeks.org/problems/reverse-digit0316/1
public class Reversedigits {
    
    public static void main(String[] args) {
        System.out.println(reverse_digit(101));
    }
    public static long reverse_digit(long n){
        Long rev=0L;
        while (n>0) {
            rev=rev*10+n%10;
            n=n/10;
        }
    return rev;
    }
}
