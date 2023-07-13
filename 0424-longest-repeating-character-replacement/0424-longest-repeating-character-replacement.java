class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[128];
        char[] chars = s.toCharArray();
        int result = 0;
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            max = Math.max(max, ++freq[chars[i]]);
            if (result - max < k)
                result++;
            else
                freq[chars[i - result]]--;

        }
        return result;
    }
}