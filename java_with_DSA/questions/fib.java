package questions;

/**
 * fib
 */
public class fib {

    public static void main(String[] args) {
        System.out.println(Fib(4));
        
    }
    static int Fib(int n){
        int ans;
        if(n!=0){
            return n*Fib(n-1);
        }
        return -1;
    }
}