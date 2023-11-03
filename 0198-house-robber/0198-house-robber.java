class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int n:nums){
            c=Math.max(a+n,b);
            a=b;
            b=c;
        }
    return b;}
}