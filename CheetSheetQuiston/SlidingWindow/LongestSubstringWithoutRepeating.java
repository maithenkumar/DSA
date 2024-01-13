
package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        lengthOfLongestSubstring("asdas");
        
    }
    public static  void lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        HashMap<Character ,Integer> hMap=new HashMap<>();
        while (j<s.length()) {
           
            if (hMap.containsKey(s.charAt(j))) {
                int temp=(j-hMap.get(s.charAt(j)));
                if (max<temp) {
                    max=temp;
                }
                i=hMap.get(s.charAt(j))+1;
                j=i+1;
                System.out.println(hMap);
                hMap.clear();
                
                
                
            }else{
                hMap.put(s.charAt(j), j);
                j+=1;
            }
        }
        System.out.println(hMap);
    System.out.println(max);
    }
}
