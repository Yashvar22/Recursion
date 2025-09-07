package Combination;

import java.util.ArrayList;

public class ques_01_print_subsequence {
  public static void subseq(int idx,ArrayList<Integer> ll,int[] arr,int n){
    if(idx==n){
    System.out.println(ll);
    return;
    }
    ll.add(arr[idx]);
    //take
    subseq(idx+1,ll,arr,n);
     // Backtrack (remove last element)
    ll.remove(ll.size() - 1);
    subseq(idx+1,ll,arr,n);
  }
  public static void main(String[] args) {
     int[] arr = {1, 2, 3};
        ArrayList<Integer> ll = new ArrayList<>();

        System.out.println("All subsequences:");
        subseq(0, ll, arr, arr.length);
  }
}
