import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        merge1(arr1, 3, arr2, 3);
    }
       static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            ans.add(nums1[i]);            
        }
        for (int index = 0; index < n; index++) {
            ans.add(nums2[index]);
            
        }
        System.out.println(ans);
    
    }
    static  void merge1(int[] nums1, int m, int[] nums2, int n){
        for(int j=0,i=m;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
System.out.println(Arrays.toString(nums1));
    }




    
     static public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        // Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
