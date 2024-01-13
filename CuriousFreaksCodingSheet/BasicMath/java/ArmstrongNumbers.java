package CuriousFreaksCodingSheet.BasicMath.java;
//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
public class ArmstrongNumbers {
    
    public static void main(String[] args) {
        System.out.println(armstrongNumber(37));
        
    }

static String armstrongNumber(int n){
    // code here
    int N=n;
    int ans=0;
    while (n>0) {
        ans+=Math.pow((int)n%10, 3);
        n=n/10;
    }
    if (ans==N) {
        return "Yes";
    }
    else{
        return "No";
    }
}
}

