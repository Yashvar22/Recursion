package Subset;
import java.util.*;
public class Subset2 {
  public static void helper(int idx,int[] arr,List<Integer> ds,List<List<Integer>> ans){
     
    ans.add(new ArrayList<>(ds));

    for(int i=idx;i<arr.length;i++){
      if(i!=idx && arr[i]==arr[i-1]) continue;
      ds.add(arr[i]);
      helper(i+1,arr,ds,ans);
      ds.remove(ds.size()-1);
    }
  }
  public static List<List<Integer>> SubsetWithoutDup(int[] arr){
    Arrays.sort(arr);
    List<List<Integer>> ans=new ArrayList<>();
    helper(0,arr,new ArrayList<>(),ans);
    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 2};
    List<List<Integer>> result = SubsetWithoutDup(arr);

    System.out.println("Subsets without duplicates:");
    for (List<Integer> subset : result) {
      System.out.println(subset);
    }
  }
}
