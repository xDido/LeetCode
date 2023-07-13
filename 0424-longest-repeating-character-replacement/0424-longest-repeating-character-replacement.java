class Solution {
    public int characterReplacement(String s, int k) {
        int left = -1;
        int right = 1;
        int result = 0;
        int temp = k;
        for (int i = 0; i < s.length(); i++) {
            left++;
            k = temp;
            right = left + 1;
            while (right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    right++;
                } else if (k != 0) {
                    k--;
                    right++;
                }
                else {
                    break;
                }
            }
                   int comp = (right - left);
            if (k > 0) {
                comp = s.length() - (right - left);
                if (comp > k)
                    comp = (right - left + k);
                else
                    return s.length();
            }
            result = Math.max(result, comp);
        }
        return result;
    }


}