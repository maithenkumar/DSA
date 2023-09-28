package questions;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {

public static void main(String[] args) {
    int [] arr={3,2,1,5,6,223,23,4};
   System.out.println( findKthLargest2(arr, 1));
}

    public static int findKthLargest(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < k; i++) {
            // int[] temp = nums;
            
            for (int index = 1; index < nums.length-1; index++) {
                int temp=nums[0];
                if (temp<nums[i]) {
                 
                    temp=nums[i];

                }
                // System.out.println(ans);
                System.out.println(temp);
            }
            // nums[tempind]=0;
        }
        return ans;
    }
  public static int findKthLargest2(int[] nums, int k) {
        //Declare a pq to store minimum element at the beginning
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(a-b));


        for(int i : nums)
        {
            //Add the element to the queue
            pq.offer(i);
            //If the size of the pq is more than k then delete the first element (minimum element)
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
    //last element will be the kth largest element
        return pq.poll();
    }
}
