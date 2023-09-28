/**
 * InsertOperation
 */
 class InsertOperation {
public static void main(String[] args) {
    //Insert at the end
int[] arr={2,3,5,6,23,423,34,234,32,4,5};

System.out.println(find(arr));


}
static  int find(int arr[]){
    int hig=0;
    int low=0;
    
    // for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if(arr[hig]<arr[j]){
                // System.out.println(arr[hig]);
                hig=j;
            }
            
        // }
        for (int i = 0; i < arr.length; i++) {
            if (arr[hig]>arr[i] && arr[low]<arr[i]) {//{2,3,5,6,23,423,34,234,32,4,5};
                low=i;
                
            }
            
        }
        
    }
    return arr[low];
}
    
}