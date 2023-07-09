class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        int fleets = 0;
        double slowest = 0;
        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, java.util.Comparator.comparingInt(o -> o[0]));
        for (int i = pairs.length - 1; i > -1; i--) {
            double currTime = (double) (target - pairs[i][0]) / pairs[i][1];
            if (currTime > slowest) {
                slowest = currTime;
                fleets++;
            } else {
                continue;
            }


        }
        return fleets;

    }
}