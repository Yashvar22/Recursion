package Combination;

public class ques_03_count_subseq_with_sum_k {
      public static int countSubseq(int idx, int[] arr, int sum, int k, int n) {
        // Base case: reached end of array
        if (idx == n) {
            return sum == k ? 1 : 0;
        }

        // Pick current element
        int countTake = countSubseq(idx + 1, arr, sum + arr[idx], k, n);

        // Not pick current element
        int countNotTake = countSubseq(idx + 1, arr, sum, k, n);

        return countTake + countNotTake;
    }

  public static void main(String[] args) {
     int[] arr = {1, 2, 1};
        int k = 2;

        int totalCount = countSubseq(0, arr, 0, k, arr.length);
        System.out.println("Number of subsequences with sum = " + k + ": " + totalCount);
  }
}
