package Array;

public class MarajarityElment {
    public static void main(String[] args) {
        int [] arr={1,1,1,6,7,8,2,1,3,1,7};
        System.out.println(marajarityElment(arr));

    }
    static int marajarityElment (int arr[] ){
        int time=0;
        int el=0;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
                if (c==0) {
                    el = arr[i];
                    el=1;
                    
                }
                if (el==arr[i]) {
                    c++;
                    
                }
                else{
                    c--;
                }
                time++;
        }
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            time++;
            if(arr[i]==el){
                count++;
            }

        }
        if (count>(arr.length/2)) {
        System.out.println(time);
            return el;
            
        }
        System.out.println(time);

        return -1;
    }
}
