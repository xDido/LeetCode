class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];
        int result = 0;
        if (height.length == 0) return 0;
        while (left < right) {
            if (height[left] > height[right]) {
                right--;
                maxRight = Math.max(height[right], maxRight);
                result += maxRight - height[right];
            } else {
                left++;
                maxLeft = Math.max(height[left], maxLeft);
                result += maxLeft - height[left];
            }
        }
        return result;
    }
}