package CuriousFreaksCodingSheet.Array.java;
//https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150

public class JumpGame {

    public static void main(String[] args) {
        int nums []= {2,3,0,1,4};
        System.out.println( jump(nums));
    }
    public static int jump(int[] nums) {
        return cheak(nums, 0, Integer.MAX_VALUE, 0, nums.length-1, 1);

    }

    private static int cheak(int[] arr, int index, int min, int j, int len, int count) {
        if (arr[index] == len) {
            min=Math.min(min, count);
            return min;
        }
        index +=arr[ j];
        if (len < arr[index]) {
            return -1;
        }
        if (len > arr[index]||arr[index]==0) {
            return cheak(arr, index+1, min, j+1, len, count+1);
        }
        return-1;
    }
}
