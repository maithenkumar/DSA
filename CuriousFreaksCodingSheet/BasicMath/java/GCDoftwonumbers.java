package CuriousFreaksCodingSheet.BasicMath.java;
//https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
public class GCDoftwonumbers {
    public static void main(String[] args) {
        System.out.println(gcd2(10, 5));
        
    }
    //optimal
    public static int gcd2(int A , int B) { 
        System.out.println("A : "+A);
        System.out.println("B : "+B);
        if(A == 0){
             return B;
        }
        return gcd(B%A , A);
  }

    //normal
    public static int gcd(int A , int B) 
    { 
        int n=Math.min(A, B);
        int Gcd=0;
        for (int i = 1; i <= n; i++) {
            if (A%i==0&&B%i==0) {
                Gcd =i;
            }
        }
        //code here
        return Gcd;
    } 
    
}
