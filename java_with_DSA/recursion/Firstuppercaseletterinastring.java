package recursion;

/**
 * First uppercaseletterinastring
 */
public class Firstuppercaseletterinastring {
    public static void main(String[] args) {
        String c="asFasjxaskjxkDda";
System.out.println(firstuppercaseletterinastring(c,0));        
        
    }
public static char firstuppercaseletterinastring(String str,int i){
    if(str.length()<i){
        return '0';
    }

if (Character.isUpperCase(str.charAt(i))) {
    return  str.charAt(i);
    
}
else{
   return firstuppercaseletterinastring(str,i+1);
}

// return '0';
}
    
}