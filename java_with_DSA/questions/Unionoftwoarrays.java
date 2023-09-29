package questions;

import java.util.HashSet;
import java.util.Set;

public class Unionoftwoarrays {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,3};
            int n=a.length;
            int m=b.length;
            System.out.println(doUnion(a, n, b, m));

    }
        public static int doUnion(int a[], int n, int b[], int m) {
            Set<Integer> temp=new HashSet<>();
            for (int index = 0; index < n; index++) {
                temp.add(a[index]);
            }           
                    for (int index = 0; index < m; index++) {
                temp.add(b[index]);
            }           
            System.out.println(temp);
        return temp.size();
        }

    
}
   