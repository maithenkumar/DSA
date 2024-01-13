package questions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        // System.out.println(
            generateParenthesis(10);
            // );
        
    }
     public  static List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int count=0;
        backtrack(ans, "", 0, 0, n ,count);
    System.out.println(count);
        return ans;

    }  
    static void backtrack(List<String > list,String str,int open ,int close,int max ,int count){
        if (str.length()==max*2) {
            count+=1;
            list.add(str);
            return;
        }
        if (open<max) {
            backtrack(list, str+"(", open+1, close, max,count+=1);
        }
        if (close<open) {
            backtrack(list, str+")", open, close+1, max,count+=1);
        }

    }
}
