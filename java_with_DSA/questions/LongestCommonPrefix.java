package questions;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = { "flow", "flight" , "flight" };
        
        // System.out.println(Arrays.toString(arr));
        
        System.out.println(longestCommonPrefix1(arr));

    }

    public static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int index=0;
        while (index<s1.length()&& index < s2.length()) {
            if (s1.charAt(index)==s2.charAt(index)) {
index++;

                
            }
            else{ 
            break;
            }
            
        }

      
        
    return s1.substring(0, index);
    }    
    public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length < 2) {
            return "";
        }

        String first = strs[0];
        int size = first.length();
        boolean iscommon = false;
        for (int el = 0; el < size; el++) {
            for (int i = 1; i < strs.length - 1; i++) {
                System.out.println(el);
                for (int j = 0; j < strs[i].length(); j++) {
                    if (strs.length == 2) {

                    }
                    if (strs.length > 2 && first.charAt(el) == strs[i].charAt(j)
                            && first.charAt(el) == strs[i + 1].charAt(j)) {
                        iscommon = true;
                        System.out.println("kasjask");

                    }
                    if (strs.length == 2 && first.charAt(el) == strs[i].charAt(j)) {
                        System.out.println("aism");

                        iscommon = true;

                    }

                }
            }
            if (iscommon == true) {
                ans = ans + "" + first.charAt(el);
                iscommon = false;

            }
        }
        return ans;
    }
     public static  String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
