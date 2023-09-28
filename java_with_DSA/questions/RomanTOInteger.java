package questions;


import java.util.HashMap;
import java.util.Map;

public class RomanTOInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt2("VI"));
    }
      static  int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }
        
        return ans;
    }
public static int romanToInt2(String s) {
    Map<Character , Integer> ans = new HashMap<Character, Integer>();
    ans.put('I', 1);
        ans.put('V', 5);
        ans.put('X', 10);
        ans.put('L', 50);
        ans.put('C', 100);
        ans.put('D', 500);
        ans.put('M', 1000);
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            if (i<s.length()-1 && ans.get(s.charAt(i))<ans.get(s.charAt(i+1))) {
                res-=ans.get(s.charAt(i));
                
            }
            else{
                res+=ans.get(s.charAt(i));

            }
            
        }
    return res;
}
}
