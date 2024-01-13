package Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[height.length - 1];
        int water = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
            } else {
                right--;
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
            }
        }
        return water;
    }

    static int trappingRainWater(int[] arr) {
        int ans = 0;
        int temp = 0;
        int i = 0;
        int j = 2;
        while (i < arr.length && j < arr.length) {
            temp += arr[i] - arr[j - 1];
            if (arr[i] <= arr[j]) {
                ans += temp;
                i = j;
                j += 1;
                temp = 0;

            } else {
                j += 1;
            }

        }
        return ans;

    }

}
