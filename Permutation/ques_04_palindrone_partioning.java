package Permutation;
import java.util.*;

public class ques_04_palindrone_partioning {

  public static void helper(int idx,String s,List<String> path,List<List<String>> ans){
    if(idx==s.length()){
      ans.add(new ArrayList<>(path));
      return;
    }

    for(int i=idx;i<s.length();i++){
      if(isPalindrome(s,idx,i)){
        path.add(s.substring(idx, i+1));
        helper(i+1, s, path, ans);
        path.remove(path.size()-1);
      }
    }
  }
  public static boolean isPalindrome(String s ,int i,int j){
    while(i<j){
      if(s.charAt(i++)!=s.charAt(j--)) return false;

    }
    return true;
  }
  public static List<List<String>> Partition(String s){
    List<List<String>> res=new ArrayList<>();
    List<String> path=new ArrayList<>();
    helper(0,s,path,res);
    return res;
  }
  public static void main(String[] args) {
      String s = "aab";
        List<List<String>> result = Partition(s);

        System.out.println("Palindrome partitions of \"" + s + "\":");
        for (List<String> partition : result) {
            System.out.println(partition);
        }

  }
}
