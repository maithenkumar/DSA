package Array;

import java.util.Arrays;

/**
 * SetAllIn0
 */
public class SetAllIn0 {

    public static void main(String[] args) {
int [][] arr={{1},{0},{1}};
        setAllIn0(arr);

        
    }

    static void setAllIn0(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int index = 0; index < arr[i].length; index++) {
                if (arr[i][index]==0){
                    set0(arr,i,index);
                    
                }
                    
                }
                
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j]==-1) {
                            arr[i][j]=0;
                            
                        }
                }
                System.out.println(Arrays.toString(arr[i]));
            }
        }     
        
    private static void set0(int[][] arr, int i, int in) {
            for (int j = 0; j < arr.length; j++) {
                for (int index = 0; index < arr[i].length; index++) {
                        arr[i][index]=-1;
                        arr[index][in]=-1;
                }
                
            }
    }
    }

