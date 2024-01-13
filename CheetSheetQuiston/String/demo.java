package String;

import java.util.HashMap;

public class demo {

    public static void main(String[] args) {
        System.out.println(getPhoneNumber("zero double three two"));

    }

    public static String getPhoneNumber(String s) {
        // Write your code here
        String ans = "";
        s = s.replaceAll(" ", "");
        HashMap<String, String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("eight", "8");
        map.put("nine", "9");
        map.put("zero", "0");
        // map.put("double", "");
        // map.put("triple", "0");
        String temp = "";
        int val = 0;

        for (int i = 0; i < s.length(); i++) {

            temp += s.charAt(i);
            if (temp.contains("double")) {

               val=2;
               temp="";
            }

            if (temp=="triple") {

               val=3;
               temp="";

            }

           
             if(map.containsKey(temp)&&val>0){
                for (int j = 0; j < val; j++) {
                    ans+=map.get(temp);
                }
                val=0;
                temp=""
;
            }  else if (map.containsKey(temp)) {
                ans += map.get(temp);
                temp = "";
            }
            // if(temp.contains(" "));{
            // temp="";
            // }

        }

        return ans;

    }

}
