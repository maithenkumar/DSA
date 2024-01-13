
/**
 * Print1tonwithoutusingloops
 */
public class Print1tonwithoutusingloops {
public static void main(String[] args) {
    printTillN(5);
}
    static void printTillN(int N){
        // code here
        if(N==0){
            return ;
        }
        printTillN(N-1);
      System.out.println(N);
    } 
}