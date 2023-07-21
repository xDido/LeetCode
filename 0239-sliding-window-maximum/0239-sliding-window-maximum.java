class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int right = 0;
        int left = 0;
        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> deque = new LinkedList<>();
        while (right < nums.length) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[right]) {
                deque.pollLast();
            }
            deque.offerLast(right);
            if (right - left + 1 == k) {
                result[left] = nums[deque.peekFirst()];
                if (deque.peekFirst() == left) {
                    deque.pollFirst();
                }
                left++;
            }
            right++;
        }
return result;
    }
}