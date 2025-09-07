package Subset;

import java.util.*;
public class SubsetSum {
  public static void helper(int idx,int sum,int[] arr,int n,List<Integer> ans){
   //base case
   if(idx==n){
    ans.add(sum);
    return;
   }

   helper(idx+1,sum+arr[idx],arr,n,ans);
   helper(idx+1, sum, arr, n, ans);
  }
  public static List<Integer> subsetSum(int[] arr,int n){
    List<Integer> ans=new ArrayList<>();
    helper(0,0,arr,n,ans);
    Collections.sort(ans);
    return ans;
  }
  public static void main(String[] args) {
     int[] arr = {3, 1, 2};
    int n = arr.length;

    List<Integer> result = subsetSum(arr, n);

    System.out.println("All possible subset sums:");
    System.out.println(result);
  }
}
