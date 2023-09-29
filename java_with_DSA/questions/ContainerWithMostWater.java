package questions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int []arr={4,3,2,1,4};

        // int []arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea3(arr));
        
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
static int containerWithMostWater2(int []height){
    
    int tol=Integer.MIN_VALUE;
   
    for (int i = 0; i < height.length; i++) {//      

        for (int j = 0; j <= height.length-1; j++) {
            int min=Math.min(height[i],height[j]);
            System.out.println(min+""+j);
            int sum=min*(j-1);
            if (tol<sum) {
                tol=sum;
                
            }

            
        }
    }
    return tol;
}
 public static  int maxArea3(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
