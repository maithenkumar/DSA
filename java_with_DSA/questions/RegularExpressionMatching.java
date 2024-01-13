package questions;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));

    }

    public static boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < p.length()) {
            if (s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else if (p.charAt(j) == '.') {
                i++;
                j++;

            } else if (p.charAt(j) == '*') {
              return true;

            } 
          
             else if (s.length() != p.length()) {
                return false;

            } else if (s.charAt(i) != p.charAt(j)) {
                return false;

            }

        }
        return true;
    }

}
