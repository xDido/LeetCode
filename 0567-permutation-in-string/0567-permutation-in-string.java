import java.util.Arrays;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int[] freq = new int[26];
        int m = s2.length();
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] g = new int[26];
        for (int i = 0; i < m; i++) {
            g[s2.charAt(i) - 'a']++;
            if (i >= n) {
                g[s2.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(freq, g))
                return true;
        }
        return false;
    }
}