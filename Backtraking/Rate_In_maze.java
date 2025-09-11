package Backtraking;

import java.util.*;

public class Rate_In_maze {
  public static void solve(int i,int j,int[][] mat,int n,ArrayList<String> ans,String path,int[][] vis){
    //base case
    if(i==n-1 && j==n-1){
      ans.add(path);
      return;
    }

    //downword
    if(i+1<n && vis[i+1][j]==0 && mat[i+1][j]==1){
      vis[i][j]=1;
      solve(i+1,j,mat,n,ans,path+'D',vis);
      vis[i][j]=0;
    }
    //left
    if(j-1>=0 && vis[i][j-1]==0 && mat[i][j-1]==1){
      vis[i][j]=1;
      solve(i,j-1,mat,n,ans,path+'L',vis);
      vis[i][j]=1;
    }

    //right
    if(j+1<n && vis[i][j+1]==0 && mat[i][j+1]==1){
      vis[i][j]=1;
      solve(i,j+1,mat,n,ans,path+'R',vis);
      vis[i][j]=0;
    }
    //upward
    if(i-1>=0 && vis[i-1][j]==0 && mat[i-1][j]==1){
      vis[i][j]=1;
      solve(i-1,j,mat,n,ans,path+'U',vis);
      vis[i][j]=0;
    }
  }
  public static ArrayList<String> findPath(int[][] mat,int n){
    int[][] vis=new int[n][n];
    
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        vis[i][j]=0;
      }
    }
    ArrayList<String> ans=new ArrayList<>();
    if(mat[0][0]==1){
      solve(0,0,mat,n,ans,"",vis);

    }
    return ans;
  }
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of maze (n): ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        System.out.println("Enter maze (0 = blocked, 1 = open):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> paths = findPath(mat, n);

        if (paths.size() == 0) {
            System.out.println("No path found!");
        } else {
            System.out.println("Paths found:");
            for (String path : paths) {
                System.out.println(path);
            }
        }

        sc.close();

  }
}
