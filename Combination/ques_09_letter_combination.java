package Combination;
import java.util.*;
public class ques_09_letter_combination {

  public static void helper(String digit,StringBuilder sb,String[] keyBoard,int idx,List<String> ans){
  // base case
   if(idx==digit.length()){
    ans.add(sb.toString());
    return;
   }

    char ch=digit.charAt(idx);
    String temp=keyBoard[ch-'0'];

    for(int i=0;i<temp.length();i++){
      sb.append(temp.charAt(i));
      helper(digit, sb, keyBoard, idx+1, ans);
      sb.deleteCharAt(sb.length()-1);
    }
  }
  public static List<String> letterCombination(String digit){
    List<String> ans=new ArrayList<>();
    if(digit.length()==0){
      return ans; 
    }
    String[] keyBoard={
      "",
      "",
      "abc",
      "def",
      "ghi",
      "jkl",
      "mno",
      "pqrs",
      "tuv",
      "wxyz"
    };
    StringBuilder sb=new StringBuilder();
    helper(digit,sb,keyBoard,0,ans);
    return ans;
  }
  public static void main(String[] args) {
    String digit = "23";
        List<String> result = letterCombination(digit);

        System.out.println("Letter combinations for digits " + digit + ":");
        for (String s : result) {
            System.out.println(s);
        }
  }
}
