package basicsmath;

public class PrimeNum {
  
    public static void main(String[] args) {
        System.out.println(primerNum(282589932));
    }

    public static boolean primerNum(int num) {
        int index = 1;
        for (int i = 1; i <=num/2; i++) {
            if ( num%i == 0) {
                index++;
            }
        }
    return index==2;

    }
}