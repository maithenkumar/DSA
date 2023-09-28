package recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] a = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(a);
    }

    static void reverseString(char[] s) {
        char[] temp = new char[s.length];
        helper(s, temp, 0,s.length-1);
        System.out.println(Arrays.toString(temp));
        s=temp;
        System.out.println(Arrays.toString(s));
    }

    public static void helper(char[] s, char[] temp, int i,int size) {
        if (size<0) {
            return;            
        }
        temp[i] = s[size  ];
        helper(s, temp, i+1,size-1);
    }
}
