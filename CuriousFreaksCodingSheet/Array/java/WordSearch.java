package CuriousFreaksCodingSheet.Array.java;

public class WordSearch {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8,9};
        if (a[23]==0) {
            System.out.println("asa");
        }
    }
 
    public static boolean exist(char[][] board, String word) {
 return        cheak(board,word,0,0);
    }
    public static boolean cheak(int[][]board , String word, int i,int j ,String ans,int index){
        if (ans==word) {
            return true;
        }
        if (board[i][j]==word.charAt(index) && board[i].length-1>=j&&board.length-1>=i)  {
            cheak(board, word, i, j+1, ans, index);
        }
        if (board[i][j+1]==word.charAt(index) && board[i].length-1>=j&&board.length-1>=i)  {
            cheak(board, word, i, j, ans, index);
        }
        if (board[i][j]==word.charAt(index) && board[i].length-1>=j&&board.length-1>=i)  {
            cheak(board, word, i, j+1, ans, index);
        }
        if (board[i][j]==word.charAt(index) && board[i].length-1>=j&&board.length-1>=i)  {
            cheak(board, word, i, j+1, ans, index);
        }
       
    }

}


