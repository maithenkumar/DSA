package questions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int []arr={9,1,8,7,10,5,12};
        System.out.println(containerWithMostWater(arr));
        
    }
    public static int containerWithMostWater(int []arr){
        int max=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j= i+1; j < arr.length; j++) {
                if (arr[i]<=arr[j]) {
                    int temp=(j)*arr[j];
                    if (max<temp) {
                        max=temp;
                        
                    }
              }
                //   else{
                    

                //         break;
                //     }
            }
            
        }
        return max;

    }
}
