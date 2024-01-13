package questions;

public class H_Index {
    public static void main(String[] args) {
        int []arr={3,0,6,1,5};
        System.out.println(hIndex(arr));
        
    }
    public static  int hIndex(int[] citations) {
        int hInn=citations.length-1;
        int count=0;
        for (int i = 0; i < citations.length; i++) {
            if(citations[i]>=hInn){
                count+=1;
            }
        }
        return count;
    }

}
