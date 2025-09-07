package Combination;
import java.util.*;
public class ques_07_combination_sum2 {
  public static void findCombination(int idx,int[] arr,int      target,List<List<Integer>> ans,List<Integer> ds){
      if(target==0){
        ans.add(new ArrayList<>(ds));
        return;
      }
      for(int i=idx;i<arr.length;i++){
        if(i>idx && arr[i]==arr[i-1]) continue;
         if(arr[i]> target) break;
         ds.add(arr[i]);
         findCombination(i+1, arr, target-arr[i], ans, ds);
         ds.remove(ds.size()-1);
      }
  }
  public static List<List<Integer>> combination2(int[] arr,int target){
    Arrays.sort(arr);
    List<List<Integer>> ans=new ArrayList<>();
    findCombination(0,arr,target,ans,new ArrayList<>());
    return ans;
  }
  public static void main(String[] args) {
     int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> result = combination2(arr, target);

        System.out.println("Unique combinations that sum to " + target + ":");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
  }

}
