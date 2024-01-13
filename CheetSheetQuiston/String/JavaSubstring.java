package String;

public class JavaSubstring {
    public static void main(String[] args) {
        String s="cdbkdub";
        javaSub(s, 0, 5);
    } 
    static String javaSub(String S, int L, int R) {
        // code here
        String ans = "";
        for (int i = L; i <= R; i++) {
            ans+=S.charAt(i);
        }
        System.out.println(ans);

        return ans;
    }
}
