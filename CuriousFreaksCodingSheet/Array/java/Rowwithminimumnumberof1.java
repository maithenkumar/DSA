package CuriousFreaksCodingSheet.Array.java;
// https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class Rowwithminimumnumberof1 {
    
    public static void main(String[] args) {
        
    }
    static int minRow(int N, int M, int A[][]) {
        // code here
        int ans =Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int count=0;
            for (int j = 0; j <A[i].length ; j++) {
                if (A[i][j]==1) {
                    count+=1;
                }
            }
            ans=Math.min(ans, count);
        }
        if(ans==0)return 1;
        return ans;
    }

}
