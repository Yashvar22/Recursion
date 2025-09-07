package Combination;

import java.util.ArrayList;

public class ques_02_print_sub_sum_k {
  public static void printSum(int idx,ArrayList<Integer> ll,int[] arr,int sum,int k,int n){
    if (idx == n) {
            if (sum == k) {
                System.out.println(ll); // print subsequence
            }
            return;
      }
    ll.add(arr[idx]);
    //take
    printSum(idx+1,ll,arr,sum+arr[idx],k,n);
     // Backtrack (remove last element)
    ll.remove(ll.size() - 1);
    printSum(idx+1,ll,arr,sum,k,n);
  }
  public static void main(String[] args) {
     int[] arr = {1, 2, 1};  // Example array
        int k = 2;              // Target sum
        ArrayList<Integer> ll = new ArrayList<>();

        System.out.println("Subsequences with sum = " + k + ":");
        printSum(0, ll, arr, 0, k, arr.length);
  }
}
