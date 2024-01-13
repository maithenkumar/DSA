package Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        // System.out.println(findMedianSortedArrays2(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;

        ArrayList<Integer> temp = new ArrayList<>();
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                temp.add(nums1[i]);
                i++;
            } else {
                temp.add(nums2[j]);
                j++;
            }
        }
        while (i < n) {
            temp.add(nums1[i]);
            i++;

        }
        while (j < m) {
            temp.add(nums2[j]);
            j++;

        }
        System.out.println(temp);
        if (temp.size() % 2 == 0) {

            int mid = (temp.size() - 0) / 2;

            return (double) (temp.get(mid) + temp.get(mid - 1)) / 2;

        } else {
            int mid = (temp.size() - 0) / 2;
            return temp.get(mid);
        }
    }

    // optimal
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int i = nums1.length - 1;
        int j = 0;
        while (i > 0 && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i--;
                j++;
            } else {
                break;
            }

        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        if ((nums1.length + nums2.length) % 2 == 0) {
            return (double) (nums1[nums1.length - 1] + nums2[0]) / 2;

        } else {
            
            if (nums1.length % 2 == 0) {
                return nums1[nums1.length-1];

            } else {
                return nums1[0];
            }

        }
    }
}
