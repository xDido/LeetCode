class Solution {
    public int countSubstrings(String s) {     
  int len1 = 0;
        int len2 = 0;
        for (int i = 0; i < s.length(); i++) {
            len1 += expandmiddle(s, i, i);
            len2 += expandmiddle(s, i, i + 1);

        }
        return len1 + len2;

    }
     private int expandmiddle(String s, int left, int right){
        int res=0;
        if(s==null||left>right) return 0;
        while(left>=0 && right<s.length() && s.charAt(left)== s.charAt(right)){
            res++;
            left--;
            right++;

        }
        return res;

    }
}