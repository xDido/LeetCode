class Solution {
 public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int[] free = set.stream().mapToInt(Number::intValue).toArray();
        if (free.length == 0) return 0;
        Arrays.sort(free);
        int max = 0;
        int count = 1;
        for (int i = 1; i < free.length; i++) {
            if (free[i] == free[i - 1] + 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }
}