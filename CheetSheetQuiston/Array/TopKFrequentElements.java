package Array;

import java.util.ArrayList;

public class TopKFrequentElements {
    public static void main(String[] args) {
        
        int [] arr={1,1,1,2,2,3};
        topKFrequent(arr, 2);
    }
    static public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> temp=new ArrayList<>();
        int per=0;
        int count=1;
        for (int i = 1; i <nums.length; i++) {
            if (nums[i]==nums[i-1]) {
                count++;
                per=nums[i-1];
                    
                }
               else{
                 if (k<=count) {
                       count=1;
                    temp.add(per);
                       
                }
               }
        }
        if (count>=k) {
            temp.add(per);
            
        }
        // System.out.println(temp);
        int [] ans=new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            ans[i]=temp.get(i);
        }

        return ans;
    }
}
