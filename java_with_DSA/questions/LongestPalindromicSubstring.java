package questions;
// https://leetcode.com/problems/longest-palindromic-substring/description

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("1baahiibujuijb"));
        
    }
    public static String longestPalindrome(String s) {
        int max=0;
        String temp="";
        String ans="";
        int count=0;
        if (s.length()==1) {
            return s;
        }
        for (int i = 0; i < s.length()-1; i++) {
                temp+=s.charAt(i);

            
                for (int j = i+1; j < s.length(); j++) {
                temp+=s.charAt(j);
                count++;
                if (s.charAt(i)==s.charAt(j)) {
                    if (max<count) {
                        max=count;
                        ans=temp;
                        // temp="";

                    }

                    
                }
            }
            count=0;
            temp="";
        }
        return ans;
    }
}