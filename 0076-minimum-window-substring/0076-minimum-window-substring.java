class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int[] tMap = new int[128];
        int[] sMap = new int[128];
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        String minStr = "";
        for (int i = 0; i < t.length(); i++) {
            tMap[t.charAt(i)]++;
        }
        while (right < s.length()) {
            char c = s.charAt(right);
            sMap[c]++;
            if (sMap[c] <= tMap[c]) {
                count++;
            }
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStr = s.substring(left, right + 1);
                }
                char c1 = s.charAt(left);
                sMap[c1]--;
                if (sMap[c1] < tMap[c1]) {
                    count--;
                }
                left++;
            }
            right++;
        }
        return minStr;

    }
}