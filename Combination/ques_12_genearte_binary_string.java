package Combination;
import java.util.*;
//generate binary string without adjacent zeroes

public class ques_12_genearte_binary_string {
  public static void helper(int n,int idx,StringBuilder sb,List<String> ans){
     //base case
     if(idx==n){
      ans.add(sb.toString());
      return;
     }

     //always pick 1
     sb.append('1');
     helper(n,idx+1,sb,ans);
     sb.deleteCharAt(sb.length()-1);

     // add 0 if prev is not 0
     if(sb.length()==0|| sb.charAt(sb.length()-1)!='0'){
      sb.append('0');
      helper(n,idx+1,sb,ans);
      sb.deleteCharAt(sb.length()-1);
     }
  }
   public static List<String> validBinaryString(int n){
    List<String> ans=new ArrayList<>();
    helper(n,0,new StringBuilder(),ans);
    return ans;
   }

  public static void main(String[] args) {
     int n = 3;
        List<String> result = validBinaryString(n);

        System.out.println("Valid binary strings of length " + n + " without adjacent zeros:");
        for (String s : result) {
            System.out.println(s);
        }
  }
}
