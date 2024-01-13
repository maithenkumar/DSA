package CuriousFreaksCodingSheet.BasicMath.java;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(is_palindrome(21));

    }
    public static  String is_palindrome(int n)
    {
        int tep=n;
        int ans=0;
        
        // Code here
        while (n>0) {
            ans=ans*10+n%10;
            n=n/10;
        }
        if (ans==tep) {
            return "Yes";
        }
        return "No";

    }
}
