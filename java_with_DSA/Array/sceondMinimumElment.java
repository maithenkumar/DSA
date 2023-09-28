package Array;

public class sceondMinimumElment {
    public static void main(String[] args) {
                        int[] arr = { 75, 2, 5, 52, 3, 5, 7,1, 8, 75, 4, 45 };

                        SceondMinimumElment(arr);
        
    }
    static void SceondMinimumElment(int []arr){
        int min=arr[0];
        int smin=Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]) {
                
                smin=min;
                min=arr[i];


            }else if(arr[i]>min&&arr[i]<smin) {
                smin=arr[i];
            }
            
        }
        System.out.println(smin);
    }
    
}
