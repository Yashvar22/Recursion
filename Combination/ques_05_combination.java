package Combination;

import java.util.*;

public class ques_05_combination {
  public static void helper(int idx,int n,int k,List<Integer> ds,List<List<Integer>> ans){
    //base case
    if(ds.size()==k){
      ans.add(new ArrayList<>(ds));
      return;
    }
    if(idx>n) return;
    ds.add(idx);
    helper(idx+1,n,k,ds,ans);//pick
    ds.remove(ds.size()-1);//backtrack
    helper(idx+1,n,k,ds,ans);//non-pick

  }
  public static List<List<Integer>> combination(int n,int k){
    List<List<Integer>> ans=new ArrayList<>();
    helper(1,n,k,new ArrayList<>(),ans);
    return ans;
  }
  public static void main(String[] args) {
       int n = 4;
        int k = 2;

        List<List<Integer>> result = combination(n, k);

        System.out.println("All combinations of size " + k + " from 1 to " + n + ":");
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }

        // Edge case example
        int n2 = 3, k2 = 5;
        System.out.println("Combination with k > n: " + combination(n2, k2)); // 
  }

}
