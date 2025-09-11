package Backtraking;

public class WordSearch {
  public boolean dfs(char[][] board,String word,int idx,int r,int c,boolean[][] vis ){
    if(idx==word.length()) return true;
    
    if(r<0 || c<0 || r>=board.length || c>=board[0].length) return false;
    if(vis[r][c] || board[r][c] != word.charAt(idx)) return false;

    vis[r][c]=true;
    boolean op1=dfs(board,word,idx+1,r+1,c,vis);
    boolean op2=dfs(board,word,idx+1,r-1,c,vis);
    boolean op3=dfs(board,word,idx+1,r,c+1,vis);
    boolean op4=dfs(board,word,idx+1,r,c-1,vis);

    vis[r][c]=false;
    return op1||op2||op3||op4;
  }
  public boolean exist(char[][] board,String word){
    int m=board.length;
    int n=board[0].length;
   boolean[][] vis=new boolean[m][n];
   for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      if(board[i][j]==word.charAt(0)){
        if(dfs(board,word,0,i,j,vis)==true) return true;
      }
    }
   }
   return false;
  }
  public static void main(String[] args) {
      WordSearch ws = new WordSearch();

        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "ABCCED"; // should return true

        boolean result = ws.exist(board, word);
        System.out.println("Word exists: " + result);
  }
}
