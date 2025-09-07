public class ques_11_TOH {
  public static int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        
        if(n==1){
            return 1;
        }
        //move n-1 disks from src -> helper
       int moves1= towerOfHanoi(n-1,from,aux,to);
        //move n-1 disks from helper->  dest
       int moves2= towerOfHanoi(n-1,aux,to,from);
         
         
         return moves1+moves2+1;
        
        
    }
  public static void main(String[] args) {
   
        int n = 3; // number of disks
        int totalMoves = towerOfHanoi(n, 1, 3, 2); // src=1, dest=3, helper=2
        System.out.println("Total moves: " + totalMoves);
  }
}
