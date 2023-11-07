package solutions.solution_1921;

import java.util.Arrays;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] timesToLose = new double[dist.length];
        for (int i = 0; i < dist.length; i++) {
            timesToLose[i] = (double)dist[i] / speed[i];
        }

        Arrays.sort(timesToLose);

        int minutesCount = 1;
        for (int i = 1; i < timesToLose.length; i++) {
            if (timesToLose[i] <= minutesCount) break;
            minutesCount++;
        }

        return minutesCount;
    }
}
