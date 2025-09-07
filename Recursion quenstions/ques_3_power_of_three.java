public class ques_3_power_of_three {
  public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n==1) return true;

        if(n%3!=0){
            return false;
        }
         return isPowerOfThree(n/3);
    }
  public static void main(String[] args) {
    
  }
}
