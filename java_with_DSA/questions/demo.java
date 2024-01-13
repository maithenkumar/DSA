package questions;


public class demo {
    public static void main(String[] args) {
        urlso("sadad://asdasd");
        
    }
    static void urlso (String s){
        String rel="";
         String temp ="";
char ch;
    for (int i = 0; i < s.length(); i++) {


         if (s.charAt(i)==':'&&s.charAt(i+1)=='/'&&s.charAt(i+2)=='/') {
            rel+=temp;
            temp="";
        
        
     }
     if(s.charAt(i)=='/'){
        ch=s.charAt(i);
        rel+=temp+" ";

        temp="";   

     }
     
     if (s.charAt(i )=='=') {
        ch=s.charAt(i);
        rel+="["+temp+": ";

        temp="";
     }
     if(s.charAt(i)=="")

     temp+=s.charAt(i);


    }
        
    System.out.println(rel);
    }
    
}
