package Subset;

import java.util.Arrays;

public class partition_to_k_sum_subset {
    public static boolean helper(int[] arr, boolean[] used, int k, int idx, int currSum, int target) {
        // if only one group left, it must be valid
        if (k == 1) return true;

        // if current subset formed
        if (currSum == target) {
            // start forming next subset
            return helper(arr, used, k - 1, 0, 0, target);
        }

        for (int i = idx; i < arr.length; i++) {
            if (used[i]) continue;
            if (currSum + arr[i] > target) continue;

            // pick
            used[i] = true;
            if (helper(arr, used, k, i + 1, currSum + arr[i], target)) {
                return true;
            }
            // unpick
            used[i] = false;
        }
        return false;
    }

    public static boolean canPartition(int[] nums, int k) {
        int total = 0;
        for (int num : nums) total += num;

        if (total % k != 0) return false;
        int target = total / k;

        Arrays.sort(nums); // optional optimization
        boolean[] used = new boolean[nums.length];
        return helper(nums, used, k, 0, 0, target);
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 5, 2, 1};
        int k1 = 4;
        System.out.println("Can partition? " + canPartition(nums1, k1)); 
        // Expected: true → subsets {5}, {1,4}, {2,3}, {2,3}

        int[] nums2 = {1, 2, 3, 4};
        int k2 = 3;
        System.out.println("Can partition? " + canPartition(nums2, k2)); 
        // Expected: false
    }
}
