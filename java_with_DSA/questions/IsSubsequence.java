package questions;

public class IsSubsequence {

    public static void main(String[] args) {

        System.out.println(isSubsequence("", "sbasb"));
    }

    public  static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j) && i == s.length() - 1) {
                return true;
            }

            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }

        }

        return false;
    }
}