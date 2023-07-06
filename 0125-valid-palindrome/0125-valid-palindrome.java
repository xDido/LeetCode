class Solution {
    public boolean isPalindrome(String s) {
        int start_index = 0;
        int end_index = s.length() - 1;
        while (start_index <= end_index) {
            if (!Character.isLetterOrDigit(s.charAt(start_index))) {
                start_index++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(end_index))) {
                end_index--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(start_index)) != Character.toLowerCase(s.charAt(end_index))) {
                return false;
            }
            start_index++;
            end_index--;
        }
        return true;
    }
}
