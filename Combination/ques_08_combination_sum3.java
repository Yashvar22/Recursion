package Combination;
import java.util.*;
public class ques_08_combination_sum3 {
public static void helper(int idx,int k,int n,List<Integer> ds,List<List<Integer>> ans,int sum){
    //base case
    if(ds.size()==k){
      if(sum==n){
        ans.add(new ArrayList<>(ds));
        return ;
      }
    }
   
    if(idx>9 || sum>n) return;
    ds.add(idx);
    helper(idx+1,k,n,ds,ans,sum+idx);
    ds.remove(ds.size()-1);
    helper(idx+1,k,n,ds,ans,sum);

  }
  public static List<List<Integer>> combination3(int k,int n){
    List<List<Integer>> ans=new ArrayList<>();
    helper(1,k,n,new ArrayList<>(),ans,0);
   return ans;
  }
  public static void main(String[] args) {
     int k = 3, n = 7;
        System.out.println(combination3(k, n));
        // Output: [[1,2,4]]
  }
}
