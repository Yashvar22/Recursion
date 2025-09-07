package Combination;
import java.util.*;

public class ques_10_letter_case_permutation {
  public static void helper(String str,int idx,StringBuilder sb,List<String> ans){
    //base case
    if(idx==str.length()){
      ans.add(sb.toString());
      return;
    }
    
    char ch=str.charAt(idx);
    if(Character.isDigit(ch)){
      sb.append(ch);
      helper(str, idx+1, sb, ans);
      sb.deleteCharAt(sb.length()-1);
    }
    else{

    //lowercase
    sb.append(Character.toLowerCase(ch));
    helper(str, idx+1, sb, ans);
    sb.deleteCharAt(sb.length()-1);

    //uppercase
    sb.append(Character.toUpperCase(ch));
    helper(str, idx+1, sb, ans);
    sb.deleteCharAt(sb.length()-1);
    }
  }
  public static List<String> LetterCase(String str){
    List<String> ans=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    helper(str,0,sb,ans);
    return ans;

  } 
  public static void main(String[] args) {
      String str = "a1b2";
        List<String> result = LetterCase(str);

        System.out.println("All letter case permutations of " + str + ":");
        for (String s : result) {
            System.out.println(s);
        }
  }
}
