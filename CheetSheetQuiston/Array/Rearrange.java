package Array;

import java.util.ArrayList;

/**
 * Rearrange
 */
public class Rearrange {
    public static void main(String[] args) {
        int A[] = {1, 2, 2, 1};
        System.out.println(assign2(A, A.length));
    }

    static ArrayList<Integer> assign2(int a[], int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while(i<n-1){
            int position = i+1;
            if(position%2 != 0){//odd
                if(position > 1 && a[i] < a[i+1]){
                    ans.add(a[i]);
                }else{
                    ans.add(a[i+1]);
                }
            }else{//even
                 if(a[i] >= a[i+1]){
                    ans.add(a[i]);
                }else{
                     ans.add(a[i+1]);
                }
            }
            i++;
        }
        return ans;


    }
    ArrayList<Integer> assign(int a[], int n) {
        // Complete the function
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {

            if (i%10==0) {
                if (a[i]>=a[i-1]) {
                    
                }
                
            }
        }
    
            return ans;
    }

}