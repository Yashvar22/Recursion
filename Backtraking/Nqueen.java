package Backtraking;

import java.util.*;

public class Nqueen {
  public static List<String> construct(char[][] board){
      List<String> res=new ArrayList<>();
      for(char[] row:board){
        res.add(new String(row));
      }
      return res;
  }
  public static boolean isValidate(int row,int col,char[][] board){
    int dupRow=row;
    int dupCol=col;
    //check upper diagonal
    while(row>=0 && col>=0){
      if(board[row][col]=='Q'){
        return false;
      }
      row--;
      col--;
    }

    //check row
    col=dupCol;
    row=dupRow;
    while(col>=0){
      if(board[row][col]=='Q') return false;
      col--;
    }
    //check low diagonal
    col=dupCol;
    row=dupRow;
    while(row<board.length && col>=0){
      if(board[row][col]=='Q'){
        return false;
      }
      row++;
      col--;
    }
    return true;
  }
  public static void helper(int col,char[][] board,List<List<String>> ans){
    //base case
    if(col==board.length){
      ans.add(construct(board));
      return;
    }
    for(int row=0;row<board.length;row++){
      if(isValidate(row,col,board)){
         board[row][col]='Q';
         helper(col+1,board,ans);
         board[row][col]='.';
      }
    }
  }
  public List<List<String>> solveNqueen(int n){
    char[][] board=new char[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        board[i][j]='.';
      }
    }
    List<List<String>> res=new ArrayList<>();
    helper(0,board,res);
    return res;
    
  }
  public static void main(String[] args) {
     Nqueen nq = new Nqueen();
        int n = 4; // you can change n

        List<List<String>> solutions = nq.solveNqueen(n);

        System.out.println("Total solutions: " + solutions.size());
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
  }
}
