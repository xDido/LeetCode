class Solution {
  public int removeDuplicates(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (!set.contains(nums[j])) {
                set.add(nums[j]);
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}