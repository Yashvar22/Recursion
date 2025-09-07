public class ques_9_count_good_num {

     static final int MOD = 1_000_000_007;
     public long myPow(long x, long n) {
        if(n==0){
            return 1;
        }
       
        long half=myPow(x,n/2);
        if(n%2==0){
            return (half*half) % MOD;
        }
        else{
            return (half * half * x) % MOD;
        }
    }
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long res=(myPow(5,even)*myPow(4,odd))%MOD;
        return (int)res;
    }
  public static void main(String[] args) {
    
  }
}
