import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;

            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int start = i + 1;
                int end = nums.length - 1;

                while (start < end) {
                    int sum = nums[i] + nums[start] + nums[end];

                    if (sum > 0) {
                        end--;
                    } else if (sum < 0) {
                        start++;
                    } else {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[start], nums[end]);
                        result.add(triplet);

                        while (start < end && nums[start] == nums[start + 1])
                            start++;

                        while (start < end && nums[end] == nums[end - 1])
                            end--;

                        start++;
                        end--;
                    }
                }
            }
        }

        return result;
    }
}
