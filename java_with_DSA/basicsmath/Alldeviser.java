package basicsmath;

public class Alldeviser {
    public static void main(String[] args) {
        alldeviser(5);
    }

    public static void alldeviser(int num) {
        int index = 1;
        while (index <= num / 2) {
            if ( num%index == 0) {

                System.out.println(index);
             
            }
               index++;

        }
        System.out.println( num);

    }
}