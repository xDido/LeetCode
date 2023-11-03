class Solution {
    
    private int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            num &= (num - 1);
            count++;
        }
        return count;
    }
    public int[] countBits(int n) {
             int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }
        return ans;
    }
}