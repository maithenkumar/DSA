/**
 * FindLastDigit
 */
package CuriousFreaksCodingSheet.BasicMath.java; 
public class FindLastDigit {

    public static void main(String[] args) {
        System.out.println(getLastDigit("3", "10"));
        // System.out.println(('0'-'0'));
    }
    // public static int digtConvert(String str){
       static int modulo(int n,String b)
    {
        int res=0;
        for(int i=0;i<b.length();i++)
        {
            res=((res*10)+(b.charAt(i)-'0'))%n;
        }
        return res;
    }
    static int getLastDigit(String a, String b) 
    {
        // code here
        if(b.length()==1 && b.equals("0"))
        return 1;
        if(a.equals("1"))
        return 1;
        
        int exp;
        int mod=modulo(4,b);
        if(mod==0)
        exp=4;
        else
        exp=mod;
        char ch=a.charAt(a.length()-1);
        long ans=(long)Math.pow(ch-'0',exp);
        return (int)ans%10;
    }
};