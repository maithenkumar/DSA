package String;

public class ReverseaString {
    public static void main(String[] args) {

        revStr("GeeksforGeeks");
    }

    static String revStr(String S) {
        String ans = "";

        for (int i = S.length() - 1; i >=0; i--) {
            ans += S.charAt(i);
        }
        System.out.println(S);
        System.out.println(ans);
        return ans;
    }
}
