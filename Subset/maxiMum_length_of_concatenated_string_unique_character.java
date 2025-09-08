package Subset;
import java.util.*;
public class maxiMum_length_of_concatenated_string_unique_character {
  static int maxLen=0;

  public static void  helper(List<String> arr,int idx,String curr){
     if(!isUnique(curr)) return;
    maxLen=Math.max(maxLen,curr.length());
    if(idx==arr.size()) return;
    helper(arr,idx+1,curr+arr.get(idx));
    helper(arr,idx+1,curr);
  }
  public static boolean isUnique(String s){
    boolean[] seen=new boolean[26];
    for(char ch:s.toCharArray()){
      if(seen[ch-'a']) return false;
      seen[ch-'a']=true;
    }
    return true;
  }
  public static int MaxLength(List<String> arr){
    helper(arr,0,"");
    return maxLen;
  }
  public static void main(String[] args) {
     List<String> arr1 = Arrays.asList("un", "iq", "ue");
        System.out.println("Max Length: " + MaxLength(arr1));
        // Expected: 4 ("uniq" or "ique")

        List<String> arr2 = Arrays.asList("cha", "r", "act", "ers");
        System.out.println("Max Length: " + MaxLength(arr2));
        // Expected: 6 ("chaers" or "acters")

        List<String> arr3 = Arrays.asList("abcdefghijklmnopqrstuvwxyz");
        System.out.println("Max Length: " + MaxLength(arr3));
        // Expected: 26
  }
}
