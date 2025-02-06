package Backtracking;

public class NQueens {

    public static void PrintBoard(char board[][]){
        System.out.println("---------Chess Board---------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][], int row , int col){
        //check the column
        for(int i=0;i<row;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //check the left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //check the right diagonal
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
         
    }
    public static void Nqueens(char board[][] , int row){

        //base case
        if(row == board.length){
            PrintBoard(board);
            return;
        }
        for(int j=0;j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
            Nqueens(board,row+1);//function call
            board[row][j] = 'X';//backtrack
            }

            
        }
    }
    public static void main (String[] args) {
        int n = 4 ;
        char [][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'X';
            }
        }
        Nqueens(board, 0);
    }
}
