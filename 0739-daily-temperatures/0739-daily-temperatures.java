class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int hottest = 0;
        for (int i = temperatures.length - 1; i > -1; i--) {
            if (hottest <= temperatures[i]) {
                hottest = temperatures[i];
                continue;
            }
            int step = 1;
            while (temperatures[i + step] <= temperatures[i]) {
                step += result[i + step];
            }
            result[i] = step;
        }
        return result;
    }
}