package Array;
class SearchInsertPosition{
    public static void main(String[] args) {
        int [] nums={1,3,5,6};
        System.out.println(searchInsert(nums,  3));
        
    }
    public static int searchInsert(int[] nums, int target) {
        int f=0;
                 
        // return helper(nums, 0, nums.length-1, target);
        
    }
    static int  helper(int[] arr ,int f ,int l ,int trg){
        
        int mid=(l-f)+f/2;
        if (l<f) {
            return mid;
        }
        if (arr[mid]==trg) {
            return mid;
        }
         if (arr[mid]<trg) {
            return helper(arr, f, mid-1, trg);            
        }
         if(arr[mid]>trg) {
            return helper(arr, mid+1, l, trg);
        }
        return f;
    } 
}