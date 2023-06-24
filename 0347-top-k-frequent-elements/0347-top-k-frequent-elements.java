class Solution {
   public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> Map = new HashMap<Integer, Integer>();
        HashSet<Integer> Set = new HashSet<Integer>();
        for (int num : nums) {
            if (!Map.containsKey(num)) {
                Map.put(num, 1);
            } else {
                Map.put(num, Map.get(num) + 1);
            }
        }
        int[] freq = Map.values().stream().mapToInt(i -> i).sorted().toArray();
        for (int i = 0; i < k; i++) {
            for (Integer key : Map.keySet()
            ) {
                if (Map.get(key) == freq[freq.length - 1 - i]) {
                    Set.add(key);
                }
            }
        }

        return Set.stream().mapToInt(i -> i).toArray();
    }
}