public class ques_7_fibo {
 static  int fibo(int n){
    if(n<=1){
      return n;
    }
    int last=fibo(n-1);
    int slast=fibo(n-2);
    return last+slast;
  }
  public static void main(String[] args) {
    int n=4;
    System.out.println(fibo(n));
  }
}
