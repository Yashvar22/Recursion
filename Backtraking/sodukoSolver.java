package Backtraking;

public class sodukoSolver {
  public static boolean isValid(char[][] board,int r,int c,char ch){
     for(int i=0;i<9;i++){
      //check row
      if(board[r][i]==ch) return false;
      //check col
      if(board[i][c]==ch) return false;
      
      //chech 3*3 grid
      int subRow=3*(r/3)+i/3;
      int sunCol=3*(c/3)+i%3;
      if(board[subRow][sunCol]==ch) return false;
     }
     return true;
  }
 public static boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board)) return true;   // recursive call
                            else board[i][j] = '.';
                        }
                    }
                    return false; // if no valid number found
                }
            }
        }
        return true; // solved completely
    }
  public static void solveSoduko(char[][] board){
    solve(board);
  }
  public static void main(String[] args) {
       char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solveSoduko(board);

        System.out.println("Solved Sudoku:");
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
  }
}
