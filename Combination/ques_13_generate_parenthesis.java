package Combination;
import java.util.*;
public class ques_13_generate_parenthesis {
  public static void helper(List<String> ans,int n,int open,int close, String curr){
    //base case
    if(curr.length()==2*n){
      ans.add(curr);
      return;
    }
    if(open<n){
      helper(ans,n,open+1,close,curr+"(");
    }
    if(close<open){
      helper(ans,n,open,close+1,curr+")");
    }
  }
  public static List<String> generate(int n){
    List<String> ans =new ArrayList<>();
    helper(ans,n,0,0,"");
    return ans;
  }
  public static void main(String[] args) {
    int n = 3;
    List<String> result = generate(n);

    System.out.println("All valid parentheses for n = " + n + ":");
    for(String s : result){
      System.out.println(s);
    }

  }
}
