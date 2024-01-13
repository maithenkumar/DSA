package CuriousFreaksCodingSheet.BasicMath.java;

public class Squarerootofanumber {
    public static void main(String[] args) {
        System.out.println(floorSqrt2(1));
    }

    static long floorSqrt2(long x){
        long ans=x/2;
        if(ans instanceof double){

        }
        System.out.println((double)x/2);
        return ans;
    }
    static long floorSqrt(long x)
    {
       // Your code here
       return (long)Math.sqrt(x);
   
    }
}
