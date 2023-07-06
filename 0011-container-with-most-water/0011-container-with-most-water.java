class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = -1;
        while (left < right) {
            int width = right - left;
            int heigh = Math.min(height[left], height[right]);
            int prod = heigh * width;
            if (prod > max) {
                max = prod;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}