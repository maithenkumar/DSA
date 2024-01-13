package CuriousFreaksCodingSheet.Array.java;

import java.util.HashMap;

public class LongestSubArraywithSumK {
    public static void main(String[] args) {
        int A[] = { 10, 4, 1, 7, 1, 9 };
        int K = 12;
        System.out.println(lenOfLongSubarr(A, A.length, K));

    }
   public static int lenOfLongSubarr2 (int A[], int N, int K) 
    {

        int maxSize=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();  // sum ,i
        
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
            if(sum==K) maxSize=Math.max(maxSize,i+1);
            
            if(map.containsKey(sum-K))  maxSize=Math.max(maxSize,(i-map.get(sum-K)));
            
            if(!map.containsKey(sum)) map.put(sum,i);
        }
        
        return maxSize;
    }
    
    public static int lenOfLongSubarr(int A[], int N, int K) {

        //int sum = 0;
        int count = 0;
        for (int index = 0; index < A.length; index++) {
            int temp = 0;
            for (int i = index; i < A.length; i++) {
                temp += A[i];
                if (temp == K) {
                    count = Math.max(count, (i - index)+1);
                }
            }
        }
        return count;
    }
}
