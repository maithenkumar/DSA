package basicsmath;

public class Amstrong {
    
    public static void main(String[] args) {
        System.out.println(amstrong(371));
        
    }
    static boolean amstrong(int num){
        int ans=0;
        int tem=num;
        while (num!=0) {
            int lastnum=num%10;
            ans=(lastnum*lastnum*lastnum)+ans;
            num=num/10;
            
        }
        return ans==tem;

    }
}
