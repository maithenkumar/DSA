// https://practice.geeksforgeeks.org/problems/count-digits5716/1
package CuriousFreaksCodingSheet.BasicMath.java;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(20));
    }
    static   int evenlyDivides(int N){
        // code here
        int n=N;
        int count=0;
        while (n!=0) {
            if (n%10!=0&&(n%10)%N==0) {
                count++;
            }
                n=n/2;
            

        }
        return count;
    }
    
}
