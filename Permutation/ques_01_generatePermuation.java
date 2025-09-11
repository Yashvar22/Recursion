package Permutation;
import java.util.*;
public class ques_01_generatePermuation {
  public static void helper(int[] arr,List<Integer> ds,List<List<Integer>> ans,boolean[] freq){
    //base case
    if(ds.size()==arr.length){
      ans.add(new ArrayList<>(ds));
      return;
    }
    for(int i=0;i<arr.length;i++){
      if(!freq[i]){
        freq[i]=true;
        ds.add(arr[i]);
        helper(arr,ds,ans,freq);
        ds.remove(ds.size()-1);
        freq[i]=false;
      }
    }
  }
  public static List<List<Integer>> permutate(int[] arr){
    List<List<Integer>> ans=new ArrayList<>();
    boolean[] freq=new boolean[arr.length];
    helper(arr,new ArrayList<>(),ans,freq);
    return ans;
  }
  public static void main(String[] args) {
     int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = permutate(arr);

        System.out.println("Permutations of " + Arrays.toString(arr) + ":");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
  }
}
