package questions;

public class FirstOccurrenceinaString {

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        
        System.out.println(strStr2(haystack, needle));
    }
    public static  int strStr2(String haystack, String needle) {
        String str="";
        int n=needle.length();

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i)==needle.charAt(0)) {
                str=haystack.substring(i,n);
                if(str==needle){
                    return i;
                }
            }
        }
        return -1;
    }
    public static  int strStr(String haystack, String needle) {
       for (int index = 0; index < haystack.length()-needle.length(); index++) {
          if (haystack.length()<needle.length()) {
            return -1;
            
        }
            if (helper(index, needle, haystack)) {
                return index;
            }
        }
    return -1;
    }
static boolean helper(int index,String ne,String hay){
    for (int i = 0; i < ne.length(); i++) {
      
        if (ne.charAt(i)!=hay.charAt(index++)) {
            return false;
            
        }
       
        
    }
        return true;
    }
}
