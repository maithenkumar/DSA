package questions;

/**
 * ValidPalindrome
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String mahe="A man, a plan, a canal: Panama";
        // System.out.println(c);
        System.out.println(a);
        // System.out.println(isPalindrome(mahe));

    }
    public static boolean isPalindrome(String s) {

   
        String c=s.toLowerCase();
        String a=c.replaceAll(" ","");
        int j=a.length()-1;
        int i=0;
        while (i<j) {
            if (!Character.isLetterOrDigit(a.charAt(i)) ) {
                i++;
            }
            else if (!Character.isLetterOrDigit(a.charAt(j)) ) {
                j--;
            }
           
            else if (a.charAt(i)!=a.charAt(j)) {
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;        
    }
}