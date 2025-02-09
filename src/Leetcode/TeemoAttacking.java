package Leetcode;

public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int max = 0, count = 0;
        for (int i : timeSeries) {
            if (max > i) {
                count -= max - i;
            }
            count += duration;
            max = i + duration;
        }

        return count;
    }
}
