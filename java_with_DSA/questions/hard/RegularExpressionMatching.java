package questions.hard;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", ".*"));

    }

    public static boolean isMatch2(String s, String p) {
        
    }
    public static boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        boolean ans=false;
        while () {
            if (s.charAt(i) == p.charAt(j)) {
                i++;
                j++;

            } else if (p.charAt(j) == '.') {
                i++;
                j++;
            } else if (p.charAt(j) == '*') {
                return true;

            } else if (s.charAt(i) != p.charAt(j)) {
                return false;
            }
        }
        return true;

    }
}
