import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        int[] charToIdx = new int[128];
        Arrays.fill(charToIdx, -1);
        while (right < s.length()) {
            char cur = s.charAt(right);
            if (charToIdx[cur] != -1) {
                left = Math.max(charToIdx[cur] + 1, left);
            }
            charToIdx[cur] = right;
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}