package Subset;
import java.util.*;
public class non_decreasing_sequene {
  public static void helper(int idx,int[] arr,List<Integer> ds,List<List<Integer>> ans){
    //base case
    if(ds.size()>=2){
      ans.add(new ArrayList<>(ds));
    }
    
    Set<Integer> used = new HashSet<>();
    for(int i=idx;i<arr.length;i++){
   if (!ds.isEmpty() && arr[i] < ds.get(ds.size() - 1)) continue; // ensure non-decreasing

      if(used.contains(arr[i])) continue;
      used.add(arr[i]);
      ds.add(arr[i]);
      helper(i+1,arr,ds,ans);
      ds.remove(ds.size() - 1); // backtrack
    }

  }

  public static List<List<Integer>> findSubset(int[] arr){
    List<List<Integer>> ans=new ArrayList<>();
    helper(0,arr,new ArrayList<>(),ans);
    return ans;
  }
  public static void main(String[] args) {
       int[] nums = {4, 6, 7, 7};
        List<List<Integer>> result = findSubset(nums);

        System.out.println("Non-decreasing subsequences:");
        for (List<Integer> seq : result) {
            System.out.println(seq);
        }
  }
}
