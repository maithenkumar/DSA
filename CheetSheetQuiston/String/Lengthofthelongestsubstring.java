package String;

public class Lengthofthelongestsubstring {
    public static void main(String[] args) {
        System.out.println(longestUniqueSubsttr("maitheen"));
    }

    static int longestUniqueSubsttr(String S) {
        int max = 0;
        for (int i = 0; i < S.length(); i++) {
            int temp = S.charAt(i);
            int count = 0;
            for (int j = i + 1; j < S.length(); j++) {
                
                if (temp == S.charAt(j)||) {
                    break;
                } 
                else {
                    count++;

                }

            }
            if (count>max) {
                max=count;
            }
          
          
        }
        return max;

    }
}
