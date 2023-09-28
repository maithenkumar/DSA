package questions;

public class Permitation {
public static void main(String[] args) {
    permitation("", "abc");
}   
    public static void permitation(String p, String up) {

        if (up.length()==0) {
            System.out.println(p);
            return;

        }
        char ch=up.charAt(0);
for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permitation(f+ch+s,up.substring(1));

}
    }
}