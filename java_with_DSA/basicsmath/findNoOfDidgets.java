package basicsmath;

public class findNoOfDidgets {

    public static void main(String[] args) {
        System.out.println(findnoOfDidgets2(1));
        
    }
    static int findnoOfDidgets(int dig){
        int ans=0;
        while (dig!=0) {
            System.out.println(dig%10);
            dig=dig/10;
            ans+=1;
        }

        return ans;
    }
     static int findnoOfDidgets2(int dig){
        int ans=(int)Math.log10(dig)+1;


        return ans;
    }
}
