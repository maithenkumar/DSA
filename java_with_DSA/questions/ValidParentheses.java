package questions;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{{{{}}}}";
        System.out.println(isValid2(str));
        
    }

    public static boolean isValid(String s) {
        boolean ans=false;
        if (s.length() % 2 != 0 || s.length() == 1|| s.length() == 0) {
            System.out.println("this 1");

            return false;

        }
        if (s.length() == 2) {
            System.out.println("this 2");

            return (s.charAt(0) == '{' && s.charAt(1) == '}' || s.charAt(0) == '[' && s.charAt(1) == ']'
                    || s.charAt(0) == '(' && s.charAt(1) == ')') ;

        }
        for (int i = 0; i < s.length()-1; i++) {

            if (s.charAt(i) == '{' && s.charAt(i+1) == '}' || s.charAt(i) == '[' && s.charAt(i+1) == ']'
                    || s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                        ans=true;

                i += 1;

            }
            //  else {
            //     System.out.println("this 3");
            //     return false;
            // }
        }
        return ans;

    }
    public static  boolean isValid1(String s) {
         Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()
             ) {

            if(x=='('){
                
                stack.push(')');
            } else if (x=='{') {
                stack.push('}');
                
            } else if (x=='[') {
                stack.push(']');
            } 
           
            else if (stack.isEmpty() || stack.pop()!=x) {

                return false;
            }
             System.out.println(stack.pop());

        }
System.out.println(stack);

        return stack.isEmpty();
        
    }
    static void sample(){
        if (true) {
            System.out.println("ksdcjsdc");
        } else if (true) {
            System.out.println("ksdcjsdc");
        } else if (true) {
            System.out.println("ksdcjsdc");
        } else if (true) {
            System.out.println("ksdcjsdc");
        } else if (true) {
            System.out.println("ksdcjsdc");
        }
    } 
        public static  boolean isValid2(String s) {

     Stack <Character>stack =new Stack<>();
        for(char x:s.toCharArray()){
             if(x=='('){
                stack.push(')');
            }

            else if(x=='{'){
                stack.push('}');
            }
            else if( x=='['){
                stack.push(']');
            }

            else if (stack.isEmpty()||stack.pop()!=x){
                return false;
            }
        } 
        return stack.isEmpty();
    } 
    
}
