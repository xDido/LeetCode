class Solution {
 public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == second) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}