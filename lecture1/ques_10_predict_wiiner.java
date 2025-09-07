import java.util.ArrayList;
import java.util.List;

public class ques_10_predict_wiiner {


  //brute fornce
  // public int findTheWinner(int n, int k) {
  //       List<Integer> players = new ArrayList<>();
  //        // fill players 1...n
  //       for (int i = 1; i <= n; i++) {
  //           players.add(i);
  //       }

  //       int index = 0; // start from 0th person
  //       while (players.size() > 1) {
  //           // move (k-1) steps ahead (circularly)
  //           index = (index + k - 1) % players.size();
  //           players.remove(index); // eliminate that player
  //       }

  //       return players.get(0); // winner
  //   }
   // optimal
    public static int winner(int n,int k){
        if(n==1){
        return 0;
        }
        return (winner(n-1,k)+k)%n;
    }
    public int findTheWinner(int n, int k) {
        return winner(n,k)+1;
    }
  public static void main(String[] args) {
    
  }
}
