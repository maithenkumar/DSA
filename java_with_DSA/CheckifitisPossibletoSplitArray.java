import java.util.ArrayList;
import java.util.List;

public class CheckifitisPossibletoSplitArray {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        
        arr.add(1);
                arr.add(1);
        arr.add(3);
System.out.println(canSplitArray(arr, 3));
    }
   static  boolean canSplitArray(List<Integer> nums, int m) {
     for(int i=1 ;i<nums.size();i++){
         if(nums.get(i-1)+nums.get(i)==m||nums.get(i)==m){
            System.out.println(nums.get(i));
             return true;
         }

     }   
     return nums.size()<3; 
    }
    
}
