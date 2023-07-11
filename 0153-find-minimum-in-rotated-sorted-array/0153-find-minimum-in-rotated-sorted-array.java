class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        int smallest = nums[0];
        while (left <= right) {
            if (nums[left] <= nums[right]) {
                smallest = Math.min(smallest, nums[left]);
                break;
            }
            int mid = (left + right) / 2;
            smallest = Math.min(smallest, nums[mid]);
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return smallest;
    }
}