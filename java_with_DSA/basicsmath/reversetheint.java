package basicsmath;

public class reversetheint {
    public static void main(String[] args) {
        System.out.println(Reversetheint(123));
    }
    public static int Reversetheint(int num){
        int ans=0;
        while (num!=0) {
            int lastnum=num%10;
            ans=(ans*10)+lastnum;
            num=num/10;
            
        }
        return ans;
    }

    
}
