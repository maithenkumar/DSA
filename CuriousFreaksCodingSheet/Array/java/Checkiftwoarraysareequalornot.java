package CuriousFreaksCodingSheet.Array.java;
https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checkiftwoarraysareequalornot {
    public static void main(String[] args) {

        
        long A[] = {1,4,3,2,45,6,6,2};
long B[] = {1,4,3,2,45,666,6,4};
System.out.println(check2(A, B, A.length));
    }

    public static boolean check2(long A[], long B[], int N) {
        HashMap<Long, Long>mp=new HashMap<>();
        // HashMap<Integer, Integer>mp=new HashMap<>();
        if(A.length!=B.length)return false;
        for (int i = 0; i < N; i++) {
            if (mp.containsKey(A[i])) {
                mp.put(mp.get(A[i]), mp.get(A[i]+1));
            }else{
                mp.put(A[i], 1l);
                }
        }
        for (int i = 0; i < N; i++) {
            if (mp.containsKey(B[i])) {
            if (mp.get(B[i])>=1) {
                mp.put( B[i],mp.get(B[i])-1);
            }    else{
                return false;
            } 
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static boolean check(long A[], long B[], int N) {
        boolean ishere = false;
        for (int i = 0; i < N; i++) {
            // long temp = A[i];
            for (int j = 0; j < N; j++) {
                if (A[i] == B[j]) {
                    ishere = true;
                    break;
                }
            }
            if (ishere == false) {
                return false;
            } else {
                ishere = false;
            }
        }

        return true;
        // Your code here
    }
}
