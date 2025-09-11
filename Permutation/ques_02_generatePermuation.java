package Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ques_02_generatePermuation {
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
      recurPermuate(idx+1, arr, ans);
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
     int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = permutate(arr);

        System.out.println("Permutations of " + Arrays.toString(arr) + ":");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }

  }
}
