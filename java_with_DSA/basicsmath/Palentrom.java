package basicsmath;

public class Palentrom {
     public static void main(String[] args) {
        System.out.println(palentrom(1301));
    }
    public static boolean palentrom(int num){
        int ans=0;
        int tem=num;
        while (num!=0) {
            int lastnum=num%10;
            ans=(ans*10)+lastnum;
            num=num/10;
            
        }
        return ans*10==tem*10;
    }
    
}
