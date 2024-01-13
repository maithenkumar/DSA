//https://practice.geeksforgeeks.org/problems/last-duplicate-element-in-a-sorted-array5539/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
package Array;

import java.util.ArrayList;

public class Lastduplicateelementinasortedarray {  
    public static void main(String[] args) {
        int [] arr={5, 3, 4, 6, 4, 7};
        System.out.println(dupLastIndex(arr, arr.length-1));
        
    }   
      public static ArrayList<Integer> dupLastIndex (int arr[], int n) {
        //Complete the function

        ArrayList<Integer> ans=new  ArrayList<Integer>();
        for (int i = n-1; i >0;i--) {
            

            if (arr[i]==arr[i-1]) {
                // if (count==1){
                    ans.add( i);
                    ans.add( arr[i]);
                    break;
                // }
               
            }
          
        }
        if (ans.isEmpty()) {
            ans.add(-1);
            
        }
        return ans;

    }
    
}
