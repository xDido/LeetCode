class Solution {
    public boolean canJump(int[] nums) {
         int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            int max = Math.min(i + nums[i], n - 1);
            for (int j = i + 1; j <= max; j++) {
                if (dp[j] == 1) {
                    dp[i] = 1;
                    break;
                }
            }
        }
        return dp[0] == 1;
    }
}