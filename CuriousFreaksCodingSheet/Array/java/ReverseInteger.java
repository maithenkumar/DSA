package CuriousFreaksCodingSheet.Array.java;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        

    }

    public static int reverse(int x) {
    int ans=0;
        while (x!=0) {
            ans+=x%10;
          
            ans*=10;
            x=x/10;
        }
        
        return ans/10;
    }
}

