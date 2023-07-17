class Solution {
    public String minWindow(String s, String t) {
        int[] tMap = new int[128];
        int[] sMap = new int[128];
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        String minStr = "";

        for (char c : t.toCharArray()) {
            tMap[c]++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
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
        }
        return minStr;
    }
}