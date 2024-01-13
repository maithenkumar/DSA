package CuriousFreaksCodingSheet.Array.java;

import java.util.ArrayList;

public class Krotate {
    public static void main(String[] args) {
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(1);arr.add(3);arr.add(6);arr.add(11);arr.add(12);arr.add(17);
        System.out.println(rotateArray(arr, 6));
    }
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int K) {

     // Write your code here.
        int count=K = K % arr.size();
        for (int i = 0; i <= count; i++) {
            swap(arr, arr.size());
        }
    return arr;
    }


    
static void swap(ArrayList<Integer> arr, int n) {
        int temp = arr.get(n-1);
        for (int i = n-1; i > 0; i--) {
             arr.set(i, arr.get(i-1));
        }
             arr.set(0,temp);

    }
}

