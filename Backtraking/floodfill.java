package Backtraking;

import java.util.Arrays;

public class floodfill {
  public void dfs(int[][] img, int sr,int sc, int oldcolor,int newColor){
    if(sr<0 || sc<0 || sr>=img.length || sc>=img[0].length) return;
    if(img[sr][sc]!=oldcolor) return;
    img[sr][sc]=newColor;
    dfs(img,sr+1,sc,oldcolor,newColor);//down
    dfs(img,sr-1,sc,oldcolor,newColor);//down
    dfs(img,sr,sc+1,oldcolor,newColor);//down
    dfs(img,sr,sc-1,oldcolor,newColor);//down

  }
  public int[][] floodfillAlgo(int[][] img,int sr,int sc,int newColor){
    int oldcolor=img[sr][sc];
    if(oldcolor==newColor) return img;
    dfs(img,sr,sc,oldcolor,newColor);
    return img;
  }
  public static void main(String[] args) {
     floodfill ff = new floodfill();

        int[][] img = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1, sc = 1, newColor = 2;

        int[][] result = ff.floodfillAlgo(img, sr, sc, newColor);

        // Print the updated matrix
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
  }
}
