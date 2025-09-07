package Combination;

public class ques_04_target_sum {

  public static int helper(int idx,int[] arr,int target,int sum){
    //base case
    if(idx==arr.length){
      if(sum==target){
        return 1;
      }
      return 0;
    }
    int add=helper(idx+1,arr,target,sum+arr[idx]);
    int sub=helper(idx+1,arr,target,sum-arr[idx]);
    return add+sub;
  }
  public static int findTarget(int[] arr,int target){
    return helper(0,arr,target,0);
  }
  public static void main(String[] args) {
    
  }
}
