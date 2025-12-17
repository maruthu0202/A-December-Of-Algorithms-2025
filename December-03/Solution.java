class Solution {
    public boolean canReachLastStone(int[] stones) {
        int maxReach = 0;

        for (int i = 0; i < stones.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + stones[i]);
            if (maxReach >= stones.length - 1) {
                return true;
            }
        }
        return true;
    }
}
