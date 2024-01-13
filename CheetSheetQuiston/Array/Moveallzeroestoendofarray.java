package Array;

import java.util.Arrays;

public class Moveallzeroestoendofarray {

    public static void main(String[] args) {
        int Arr[] = {0,3, 5, 0, 0, 4};

        pushZerosToEnd3(Arr, Arr.length);
    }
           static  void pushZerosToEnd3(int[] arr, int n) {
           int cout=0;
           for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                arr[cout]=arr[i];
                cout++;
            }
           }
           for (int i = cout; i < arr.length; i++) {
                arr[i]=0;
           }

        }
       static  void pushZerosToEnd2(int[] arr, int n) {
         int left=0;
        int right=n-1;
              while (left<right) {
                  if (arr[left]==0) {
                    int temp=arr[left];
                    for (int i = right; i <=left; i++) {
                        if (arr[i]!=0) {

                            
                        }
                    }
                    arr[n-1]=temp;
                    right--;
                  }
                  else{
                    left++;
                  }


              }
                      System.out.println(Arrays.toString(arr));

    }

   static  void pushZerosToEnd(int[] arr, int n) {
        // code here
        int left=0;
        int right=n-1;
        while (left<right) {
            if (arr[left]==0) {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--; 
                
            }else{
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
