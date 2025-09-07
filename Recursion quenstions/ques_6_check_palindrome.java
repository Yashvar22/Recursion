public class ques_6_check_palindrome {
  public static boolean f(int i,String str){
    if(i>=str.length()/2){
      return true;
    }
    if(str.charAt(i)!=str.charAt(str.length()-1-i)){
      return false;
    }
    return f(i+1,str);
  }
  public static void main(String[] args) {
    String str="madan";
    int n=str.length();
    System.out.println(f(0,str));

  }
}
