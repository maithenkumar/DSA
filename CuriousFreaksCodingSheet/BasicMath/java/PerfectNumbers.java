package CuriousFreaksCodingSheet.BasicMath.java;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(8));
    }
    
    static int isPerfectNumber(long N) {
        // code here
        if (N==1||N==0) {
            return 1;
        }
        if (N==fatctor(N/2, 1)) {
            return 1;
        }
return 0;


    }
    static long fatctor(long num,long i){
        if (num<i) {
            return 0;
        }
    return fatctor(num, i+1)+fatctor(num, i+2);
    }

}

