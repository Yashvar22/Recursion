package Permutation;

import java.util.ArrayList;
import java.util.List;

public class ques_03_Beautiful_ArrageMent {
   public static void recurPermuate(int idx,int[] arr,List<List<Integer>> ans){
    //base case
    if(idx==arr.length){
      List<Integer> ds=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
         ds.add(arr[i]);
      }
      ans.add(new ArrayList<>(ds));
      return;
    }
    for(int i=idx;i<arr.length;i++){
      swap(i,idx,arr);
      if(arr[idx] %idx==0 || (idx+1)% arr[idx]==0){
      recurPermuate(idx+1, arr, ans);
      }
      swap(i,idx,arr);
    }
  }
  public static void swap(int i,int j,int[] arr){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }

  public static List<List<Integer>> permutate(int[] arr){
    List<List<Integer>> ans=new ArrayList<>();
    recurPermuate(0,arr,ans);
    return ans;
  }
  public static void main(String[] args) {
  int n = 3;
        int[] arr = new int[n];
        for (int i = 1; i <=n; i++) arr[i] = i; // {1,2,3}

        List<List<Integer>> result = permutate(arr);

        System.out.println("Beautiful Arrangements for n = " + n + ":");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }

        System.out.println("Total count = " + result.size());
  }
}
