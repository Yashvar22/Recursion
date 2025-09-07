package Combination;

public class ques_11_kth_lexicographical_string {
  static String res="";
  static int cnt=0;

  public static void helper(int n,int k, StringBuilder sb, char prev){
    //base case
    if(sb.length()==n){
      cnt++;
      if(cnt==k){
        res=sb.toString();
      }
      return;
    }


    for(char ch='a';ch<='c';ch++){
      if(prev!=ch){
      sb.append(ch);
      helper(n, k, sb,ch);
      sb.deleteCharAt(sb.length()-1);
      if (!res.equals("")) return;
      
      }
      
    }
  }
  public static String getHappString(int n,int k){
    helper(n,k,new StringBuilder(),' ');
    return res;
  }

  public static void main(String[] args) {
    int n = 3, k = 9;
    String result = getHappString(n, k);

        if (result.equals("")) {
            System.out.println("No such string exists for n=" + n + " and k=" + k);
        } else {
            System.out.println("The " + k + "-th happy string of length " + n + " is: " + result);
        }
  }
}
