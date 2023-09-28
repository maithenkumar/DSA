package recursion;
//remove the elment from the string 
public class quistion1 {
    public static void main(String[] args) {
        String str="bbccdd";
        char ch='b';
        System.out.println(removeElen2("", str));

        
    }
    static String removeElment(String s,char ch,int index){
        // int index=0;
    String ans="";
    int size=s.length()-1;
    char temp=s.charAt(index);
    while (index<size ) {
        if (ch==temp) {
            index+=1;
            return removeElment(s, ch ,index);
            
        }
        else {
            ans+=temp;
            index+=1;
            return ans+ removeElment(s, ch,index);

        }
        
    }
    return ans;
}
    static String removeElen2(String p,String up){
        if (up.isEmpty()) {
            return p;

        }
            char temp = up.charAt(0);
            if ('c'==temp) {
                 removeElen2(p,up.substring(1));
            }
            else{
                  removeElen2(p+temp,up.substring(1));
            }

            return "";
            
       
        
    
}
public static void main(){
    return;
}
}

