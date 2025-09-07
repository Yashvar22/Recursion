package Combination;
import java.util.*;
public class ques_06_combination_sum1 {

  public static void helper(int idx,int[] arr,int target,List<Integer> ds,List<List<Integer>> ans){
    //base case
    if(idx==arr.length){
      if(target==0){
        ans.add(new ArrayList<>(ds));
      }
      return;
    }

    if(arr[idx]<=target){
      ds.add(arr[idx]);
      helper(idx,arr,target-arr[idx],ds,ans);
      ds.remove(ds.size()-1);
    }
    helper(idx+1, arr,target,ds,ans);
  }
  public static List<List<Integer>> Combination1(int[]arr,int target ){
    List<List<Integer>> ans=new ArrayList<>();
    helper(0,arr,target,new ArrayList(),ans);
    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = Combination1(arr, target);

        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
  }
}
