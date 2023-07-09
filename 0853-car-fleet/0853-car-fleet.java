class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 1 || position.length == 0)
            return position.length;
        double[] time = new double[target];
        int fleets = 0;
        for (int i = 0; i < position.length; i++) {
            time[position[i]] = (double)(target - position[i]) / speed[i];
        }
        double slowest = 0;
        for (int i = time.length - 1; i >= 0; i--) {
            if (time[i] > slowest) {
                slowest = time[i];
                fleets++;
            }
        }
        return fleets;


    }
}