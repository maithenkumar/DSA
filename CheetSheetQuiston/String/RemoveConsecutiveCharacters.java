package String;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {

        System.out.println(removeConsecutiveCharacter("maitheen"));
    }
    public static  String removeConsecutiveCharacter(String S){
        int i=0;    
        int j=1;
        String ans="";
        while (j<S.length()){ 

        
            if (S.charAt(i)==S.charAt(j)) {
                
                j++;
            }else{
               ans+=S.charAt(i);
                i=j;
                j++;


            }
            
        }
        if (S.charAt(i)==S.charAt(j-1)) {
            ans+=S.charAt(i);
        }
        return ans;
        
    }
}
