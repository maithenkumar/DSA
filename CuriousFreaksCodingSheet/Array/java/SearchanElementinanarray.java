package CuriousFreaksCodingSheet.Array.java;

public class SearchanElementinanarray {
    public static void main(String[] args) {
        int [] arr={1,2,4,3,2,3};
        System.out.println(search2(arr, arr.length, 3));
    }
//optmial
    static int search2(int arr[], int N, int X){
int i=0;
int j=N-1;
while(i<=j){
    if (arr[i]==X) {
        return i;
    }if (arr[j]==X) {
        return j;
    }
    else{
        i++;
        j--;
    }
}
return -1;
    }
    static int search(int arr[], int N, int X)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                return i;
            }
        }

        return -1;
        
    }

}
