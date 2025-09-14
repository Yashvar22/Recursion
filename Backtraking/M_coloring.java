class M_coloring{
  static boolean isSafe(int node,int[][] adj,int m,int[] color,int v,int col){
    for (int i = 0; i < v; i++) {
            if (adj[node][i] == 1 && color[i] == col) {
                return false;
            }
        }
        return true;
    
   }
  static boolean solve(int v,int[][] adj,int m,int[] color,int node){
    if(node==v){
      return true;
    }
    for(int i=1;i<=m;i++){
      if(isSafe(node,adj,i, color,v,i)==true){
       color[node]=i;
      }
      if(solve(v,adj,m,color,node+1)) return true;
      color[node]=0;
    }
    return false;
   }
   boolean graphColoring(int v, int[][] edges, int m){
    int[] color=new int[v];
    int[][] adj=new int[v][v];
     for(int[] e : edges) {
          int u = e[0];
          int w = e[1];
          adj[u][w] = 1;
          adj[w][u] = 1; // because undirected
        }
        if(solve(v,adj,m,color,0)==true) return true;
        return false;
   }
  public static void main(String[] args) {
     M_coloring obj = new M_coloring();

        // example: Graph with 4 nodes and 5 edges
        int v = 4;
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 2}, {1, 3}, {2, 3}
        };
        int m = 3; // number of colors

        if (obj.graphColoring(v, edges, m))
            System.out.println("Coloring possible with " + m + " colors");
        else
            System.out.println("Coloring NOT possible with " + m + " colors");
  }
}